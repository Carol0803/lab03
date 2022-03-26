package exercise4;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class RainfallDataReadInEachDistrict {

	public static void main(String[] args) {
		String sourceFile = "dailyRainfallInEachDistrict.txt";
		System.out.println("Reading data from " + sourceFile + "\n");
		
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));
			
			int rainfall = 0;
			int totalRainfall = 0;
			int noOfDays = 0;
			String id = "";
			String name = "";
			String district = "";
			
			while(dis.available() > 0) {
				System.out.print("\n");
				id = dis.readUTF();
				name = dis.readUTF();
				district = dis.readUTF();
				System.out.println(id + "\t" + name + "\t" + district);
				
				for(int index = 0; index < 5; index++) {
					rainfall = dis.readInt();
					System.out.print(rainfall + " ");
					
					totalRainfall += rainfall;
					noOfDays++;
				}
				
				double averageRainfall = (double)totalRainfall / (double)noOfDays;
				System.out.print("\nAverage rainfall is: " + averageRainfall + "\n");
			}
			
			dis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("\nEnd of program.");

	}

}
