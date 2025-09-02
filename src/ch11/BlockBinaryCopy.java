package ch11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BlockBinaryCopy {
	public static void main(String[] args) {
		File src = new File("C:/lyb/a02.jpg"); // 원본파일
		File dest = new File("C:/lyb/a02.jpg"); // 복사파일
		try {
			FileInputStream fi = new FileInputStream(src); // 파일입력바이트스트림생성
			FileOutputStream fo = new FileOutputStream(dest); // 파일출력바이트스트림생성
			byte[] buf = new byte[1024 * 10]; // 10KB 버퍼
			while (true) {
				int n = fi.read(buf); // 버퍼크기만큼읽기. n은실제읽은바이트
				fo.write(buf, 0, n); // buf[0]부터n 바이트쓰기
				if (n < buf.length)
					break; // 버퍼크기보다작게읽었기때문에파일끝에도달. 복사종료
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를" + dest.getPath() + "로복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일복사오류");
		}
	}
}