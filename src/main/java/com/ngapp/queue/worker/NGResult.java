package com.ngapp.queue.worker;

public interface NGResult<T> {
	boolean getStatus();
	T getResult();
	
}
