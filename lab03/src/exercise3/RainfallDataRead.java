package exercise3;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class RainfallDataRead {

	public static void main(String[] args) {
		
		String sourceFile = "dailyRainfall.txt";
		System.out.println("Reading data from " + sourceFile + "\n");
		
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));
			
			int rainfall = 0;
			int totalRainfall = 0;
			int noOfDays = 0;
			String date = "";
			
			while(dis.available() > 0) {
				date = dis.readUTF();
				rainfall = dis.readInt();
				System.out.println(date + "\t" + rainfall);
				
				totalRainfall += rainfall;
				noOfDays++;
			}
			
			dis.close();
			
			double averageRainfall = (double)totalRainfall / (double)noOfDays;
			System.out.print("\nAverage rainfall for "+ noOfDays + " days is: " + averageRainfall);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nEnd of program.");
 
	}

}
