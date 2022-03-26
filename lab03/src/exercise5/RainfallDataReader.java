package exercise5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RainfallDataReader {

	public static void main(String[] args) {
		String sourceFile = "rainfallDataCharacter.txt";
		System.out.println("Reading data from " + sourceFile + "\n");
		
		try {
			BufferedReader is = new BufferedReader(new FileReader(sourceFile));
			
			int rainfall = 0;
			int totalRainfall = 0;
			int noOfDays = 0;
			String id = "";
			String name = "";
			String district = "";
			
			for(int i = 0; i < 5; i++) {
				System.out.print("\n");
				id = is.readLine();
				name = is.readLine();
				district = is.readLine();
				System.out.println(id + "\t" + name + "\t" + district);
				
				for(int index = 0; index < 5; index++) {
					rainfall = is.read();
					System.out.print(rainfall + " ");
					
					totalRainfall += rainfall;
					noOfDays++;
				}
				
				double averageRainfall = (double)totalRainfall / (double)noOfDays;
				System.out.print("\nAverage rainfall is: " + averageRainfall + "\n");
			}
			
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("\nEnd of program.");

	}

}
