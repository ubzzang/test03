package ch11;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStremReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader rd=new InputStreamReader(System.in);
		while(true) {
			System.out.println("키도드 입력");
			try {
				int c=rd.read();
				System.out.println(c);
				if(c==-1) // 끝이면 빠져나가랑 ~
					break;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
