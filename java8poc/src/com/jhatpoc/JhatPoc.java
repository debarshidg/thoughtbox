package com.jhatpoc;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class JhatPoc {
	public static void main(String[] args) {
	    final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
	    executorService.scheduleAtFixedRate(new Runnable() {
	        @Override
	        public void run() {
	            myTask();
	        }
	    }, 1, 2, TimeUnit.MINUTES);
	}

	private static void myTask() {
	    System.out.println("Running");
	}
}
