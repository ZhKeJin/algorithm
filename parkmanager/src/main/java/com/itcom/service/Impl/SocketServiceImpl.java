package main.java.com.itcom.service.Impl;


import com.itcom.service.ISocketService;
import com.itcom.socket.Server;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.net.Socket;


/**
 * @author wangpei 
 * @version 
 *创建时间：2017年2月26日 下午7:32:17 
 * 类说明 
 */
@Service
public class SocketServiceImpl implements ISocketService {
	public static Socket controller=null;//总控socket
	
     @PostConstruct//初始化之前调用
	 public void init() {
		System.out.println("进入impl中的init");
		Server socketDemo=new Server();
		socketDemo.start();
	//	this.socket=socketDemo.getSocket();
		
	}
	
 
}
 