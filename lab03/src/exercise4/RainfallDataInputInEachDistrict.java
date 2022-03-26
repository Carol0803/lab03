package exercise4;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class RainfallDataInputInEachDistrict {

	public static void main(String[] args) {
		String outFile = "dailyRainfallInEachDistrict.txt";
		
		//String date[] = {"18/03","19/03","20/03","21/03","22/03","23/03"};
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
			DataOutputStream dos = new DataOutputStream
					(new FileOutputStream(outFile));
			
			for(int index = 0; index < 5; index++) {
				//dos.writeUTF(date[index]);
				dos.writeUTF(id[index]);
				dos.writeUTF(name[index]);
				dos.writeUTF(district[index]);
				for(int no = 0; no < 5; no++) 
					dos.writeInt(rainfall[index][no]);
				dos.flush();
			}
			
			
			dos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End of program. Check out "+ outFile );

	}

}
