package com.ngapp.queue.worker;

/**
 * 
 * Manage Task, assign and get the result back
 * 
 * @author QuanLe
 *
 */
public interface NGTaskManager {
	
	int numberOfActiveWorker();
	int numberOfWorkers();
	void assignTaskAndLeave();
	void assignTaskAndWait(CallBack callBack);
}
