package com.ngapp.queue.worker;


/**
 * 
 * Basic worker implementation
 * 
 * @author QuanLe
 *
 */
public interface QueueWorker extends Runnable{
	void process();
	void complete();
	void failed();
}	
