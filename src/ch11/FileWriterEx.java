package ch11;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		try {
			fw=new FileWriter("C://test.txt", true);
			fw.write('1');
			fw.write("가마다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
