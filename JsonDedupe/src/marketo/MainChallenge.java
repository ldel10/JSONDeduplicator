package marketo;

import java.io.File;
import java.util.ArrayList;


import org.json.simple.*;

public class MainChallenge {

	/**
	 * javac -cp .:json-simple-1.1.1.jar marketo/MainChallenge.java
	 * java -cp .:json-simple-1.1.1.jar marketo/MainChallenge leads.json 
	 * williams-MacBook-Pro:src williamdelumpa$ javac -cp .:json-simple-1.1.1.jar marketo/*.java
	 * williams-MacBook-Pro:src williamdelumpa$ java -cp .:json-simple-1.1.1.jar marketo/MainChallenge leads.json 
	 * @param args
	 */
	private static String outputPath = System.getProperty("user.dir") + File.separator + "deduplicatedLeads.json";
	private static File outputFile = new File(outputPath);
	
	public static void main(String[] args){
		
		File input = new File(args[0]);
		
		//parse JSON
		JSONObject leads = HandleJson.getLeads(input);
		
		//Remove duplicates
		ArrayList<Lead> deduped = HandleJson.dedupe((JSONArray) leads.get("leads"));
		
		//write to output
		HandleJson.writeToOutput(outputFile, deduped);
			
	}
}
