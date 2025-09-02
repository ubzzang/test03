package ch11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		try {
			bis=new BufferedInputStream(new FileInputStream("C:/lyb/a02.jpg"));
			bos=new BufferedOutputStream(new FileOutputStream("C:/lyb/a02.jpg"));
			long start = System.currentTimeMillis();
			System.out.println("시작 전 시간 : " + start);
			int i;
			while((i=bis.read()) != -1) {
				bos.write(i);
			}
			long end=System.currentTimeMillis();
			System.out.println("복사 후 시간 : "+end);
			System.out.println("복사에 걸린 시간 : " + (end-start));
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
