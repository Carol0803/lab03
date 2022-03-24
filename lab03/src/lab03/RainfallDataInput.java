package lab03;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class RainfallDataInput {

	public static void main(String[] args) {
		
		String outFile = "dailyRainfall.txt";
		
		String date[] = {"18/03","19/03","20/03","21/03","22/03","23/03"};
		int rainfall[] = {7,0,0,8,0,0};
		
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
			
			for(int index = 0; index < date.length; index++) {
				dos.writeUTF(date[index]);
				dos.writeInt(rainfall[index]);
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
