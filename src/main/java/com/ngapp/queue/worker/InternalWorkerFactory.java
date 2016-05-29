package com.ngapp.queue.worker;

/**
 * 
 * 
 * @author QuanLe
 *
 */
public class InternalWorkerFactory implements WorkerFactory {
	
	private static WorkerFactory INSTANCE;
	
	public static WorkerFactory getInstance() {
		if(INSTANCE == null){
			INSTANCE = new InternalWorkerFactory(); 
		}
		return INSTANCE;
	}
	
	private InternalWorkerFactory() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public NGWorker createWorker() {
		return new InternalNGWorkerImpl();
	}

}
