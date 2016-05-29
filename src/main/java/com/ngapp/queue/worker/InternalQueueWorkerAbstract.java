package com.ngapp.queue.worker;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * Consumer class to process the message
 * 
 * @author QuanLe
 *
 */
public class InternalQueueWorkerAbstract implements InternalQueueWorker{
	
	private final LinkedBlockingDeque<NGTask> taskQueue;
	
	public InternalQueueWorkerAbstract(LinkedBlockingDeque<NGTask> taskQueue) {
		this.taskQueue = taskQueue;
	}
	
	public LinkedBlockingDeque<NGTask> getTasks(){
		return taskQueue;
	}
	
	@Override
	public void process() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void complete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void failed() {
		
	}

	@Override
	public void run() {
		
		while(true){
			try {				
				NGTask task = taskQueue.poll(60L, TimeUnit.SECONDS);
				task.execute();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
