package java0621A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiveThread_PerClient extends Thread {
	Socket socket;
// 생성자 소켓 받아서 멤버 초기화
	public ReceiveThread_PerClient(Socket socket) {
		this.socket = socket;
	}
// 스레드 동작
	public void run() {
		try {
// 받은 소켓으로 입력 스트림 얻어서 문자 입력 스트림 버퍼 생성			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
// 스트림으로 전달 받은 메시지 한줄 저장
				String str = br.readLine();
//받은 메세지가 null이면 종료
				if(str == null)
					break;
				System.out.println(str);
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
