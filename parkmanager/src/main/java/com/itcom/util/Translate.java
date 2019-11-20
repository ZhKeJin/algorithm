package main.java.com.itcom.util;

import com.itcom.service.Impl.SocketServiceImpl;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Translate {
	static ServerSocket serverSocket;
	static Socket  socket;
	public Translate(Socket socket) throws IOException {
		//serverSocket = new ServerSocket(8088);
		this.socket = socket;
		System.out.println("连接上啦");
	}
	
		public static String Send(String message) {
			try {

				System.out.println(message+".........");

				//Socket socket = new Socket();
				//Translate translate = new Translate();
				PrintStream out=new PrintStream(socket.getOutputStream());

				System.out.println(message+".........");

				out.print(message);
				//Thread.sleep(10000);
				//out.close();
//				socket.close();
//				serverSocket.close();
				return "success";
			} catch (Exception se) {
				se.printStackTrace();
				return "false";
			}
		}
}

