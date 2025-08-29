package ch11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fout=null;
		
		try {
			fout=new FileOutputStream("C:/lyb/test001.out");
			byte b[]={7,51,3,4,-1,24};
			
			for(int i=0; i<b.length; i++) {
				fout.write(b[i]);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
