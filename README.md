# JSONDeduplicator
Java program that removes duplicate json objects from json input file


/****USAGE****
clone the repo: git clone https://github.com/LiamDelumpa/JSONDeduplicator.git

From the root directory of the cloned repo, cd to the src folder: cd JSONDeduplicator/JsonDedupe/src/  
This src file contains the input file to pass in as an argument, as well as an external jar for the json library which needs to be   compiled.  

Compile the program: javac -cp .:json-simple-1.1.1.jar marketo/*.java  
Run the program: java -cp .:json-simple-1.1.1.jar marketo/MainChallenge leads.json   

When you run the program, I have provided logging in the form of print statements. The console will print out all deletions and insertions 
to the original json object list.   
The output is written to a file called deduplicatedLeads.json  
****/

/******Objective*******/  
 Take a variable number of identically structured json records and de-duplicate the set.  

 An example file of records is given in the accompanying 'leads.json'. Output should be same format, with dups reconciled according to the  following rules:

The data from the newest date should be preferred
duplicate IDs count as dups. Duplicate emails count as dups. Both must be unique in our dataset. Duplicate values elsewhere do not count as dups.
If the dates are identical the data from the record provided last in the list should be preferred
 Simplifying assumption: the program can do everything in memory (don't worry about large files)

The application should also provide a log of changes including some representation of the source record, the output record and the individual field changes (value from and value to) for each field.

Please implement as a command line Java program.
