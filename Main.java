// TODO: Step 2 - Import file input statements here
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args) 
	{
		//TEST FOR STEP 1 (you can delete/comment this out after completing step 1)
		//Plant test = new Plant("Stinging Nettle,65,anti-inflammatory and culinary");
		//System.out.println("test plant:\n" + test + "\n\n");


		//TODO: Step 2 - Declare + initialize variables for file input here
		Scanner inputFile = null;
		ArrayList<Plant> myPlant = new ArrayList<Plant>();
		
		//TODO: Step 2 - Connect input stream to file (dont forget the try/catch!)
		try {
			inputFile = new Scanner(new FileInputStream("Forage.csv"));

		} catch (FileNotFoundException fnfe) {
			System.out.println("File not found");
			System.exit(0);
			;
		}

		//TODO: Step 2 - create loop to read through whole file
		while(inputFile.hasNextLine()) {
			//System.out.println(inputFile.nextLine());
			String currentLine = inputFile.nextLine();
			Plant currentPlant = new Plant(currentLine);
			myPlant.add(currentPlant);

			System.out.println("*** added new plant with the following info: " + currentPlant.getName());
		}	

		//TODO: Step 3 - build Plant Objects and store into ArrayList
		System.out.println("\n\nadded a total of" + myPlant.size() + "records from file\n\n");


		//TODO: Step 2 - close the input stream

		inputFile.close();

		//TODO: Step 3 - print contents of ArrayList
		System.out.println("plants in my collection: \n");
		for(Plant p : myPlant) {
			System.out.println(p + "\n");
		}
	}
}