package com.ngapp.queue.worker;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ngapp.example.Application;

/**
 * Consumer class to process the message
 * 
 * @author QuanLe
 *
 */
public abstract class AbstractInternalNGWorker implements InternalNGWorker{
	private final static Logger logger = LoggerFactory.getLogger(Application.class);
	private final LinkedBlockingQueue<NGTask> taskQueue;
	
	public AbstractInternalNGWorker() {
		taskQueue = new LinkedBlockingQueue<>();
	}
	
	@Override
	public void startWorking() {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(this);
	}
	
	@Override
	public void accept(NGTask task) {
		taskQueue.add(task);
	}
	
	protected void process() throws Exception{
		NGTask task = null;
		try {				
			task = this.taskQueue.poll(60L, TimeUnit.SECONDS);
			task.execute();
			this.complete();
		} catch (InterruptedException e) {
			this.failed();
			throw new RuntimeException("Failed to execute the task", e);
		}
		
	}

	abstract protected void complete();
	abstract protected void failed();

	@Override
	public void run() {
		while(true){
			try {
				process();
			} catch (Exception e) {
				logger.warn("Failed to execute a task", e);
			}
		}
	}
	
}
