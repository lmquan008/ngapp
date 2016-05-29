package com.ngapp.queue.worker;

/**
 * 
 * Working on local queue thread
 * 
 * @author QuanLe
 *
 */
public interface InternalNGWorker extends NGWorker {
	void accept(NGTask task);
}
