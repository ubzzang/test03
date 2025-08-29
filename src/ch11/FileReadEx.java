package ch11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin=null;
		try {
			fin = new FileReader("C://test.txt"); // 역슬래쉬 말고 ~
//			int c;
			char[] buf = new char[100];
			int c;
			
			while ((c= fin.read(buf)) != -1) {
				System.out.println(c);
				System.out.println(buf); //
			}
			System.out.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
