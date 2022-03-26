package exercise5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RainfallDataGenerator {

	public static void main(String[] args) {
		String outFile = "rainfallDataCharacter.txt";
		
		String id[] = {"2320005","2222002","2324033","2225044",
				"2223023","2222003"};
		String name[] = {"Ladang Sg. Bharu","Durian Tunggal",
				"Hospital Jasin","Sg. Chohong","Sg. Duyong","Klebang Besar"};
		String district[] = {"Alor Gajah","Alor Gajah","Jasin",
				"Jasin","Melaka Tengah","Melaka Tengah"};
		int rainfall[][] = {{1,0,0,15,0,0},
{9,0,0,7,0,7},
{12,0,0,16,0,0},
{15,0,0,25,0,0},
{7,0,0,42,0,0},
{7,0,0,4,0,0}};
		
		try {
			PrintWriter os = new PrintWriter(new FileWriter(outFile));
			
			for(int index = 0; index < 5; index++) {
				os.write(id[index] + "\n");
				os.write(name[index] + "\n");
				os.write(district[index] + "\n");
				for(int no = 0; no < 5; no++) 
					os.write(rainfall[index][no]);
				os.flush();
			}
			
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("End of program. Check out "+ outFile );

	}

}
