package java0621;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class SimpleClient {
	public static void main(String[] args) {

		InputStream is;
		BufferedReader br;
		String message = null;
		try {
			Socket s1 = new Socket("192.168.10.8", 5434);
			is = s1.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));
			message = br.readLine();
			System.out.println(message);
			s1.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
