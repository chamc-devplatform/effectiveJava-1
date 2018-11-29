package com.effective.java.object;

import java.net.Socket;
import java.util.Map;
import java.util.WeakHashMap;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public class SocketManager {
	private Map<Socket, User> m = new WeakHashMap<Socket, User>();

	public void setUser(Socket s, User u) {
		m.put(s, u);
	}

	public User getUser(Socket s) {
		return m.get(s);
	}
}
