package com.github.mahui53541.multithread.ReentrantLockTest;

public class MyThread extends Thread {
	private MyService service;

	public MyThread(MyService service) {
		super();
		this.service=service;
	}
	
	public void run() {
		service.testMethod();
	}
	
}
