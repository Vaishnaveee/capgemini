package com.threadsdemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
	public static void main(String[] args) {
	
		ExecutorService  executorService 
						= Executors.newSingleThreadExecutor();
		
		MyClass myc = new MyClass(); 

		executorService.submit(myc);
		executorService.shutdown();
	}
}

class MyClass implements Runnable{

	public void task() {
		System.out.println("My task");
	}
	@Override
	public void run() {
		 task();
	}
}