package com.ngapp.queue.worker;


/**
 * 
 * Basic worker implementation
 * 
 * @author QuanLe
 *
 */
public interface NGWorker extends Runnable{
	void startWorking();
	
}	
