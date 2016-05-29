package com.ngapp.queue.worker;

public interface NGResult{
	
	//FAIL or SUCCESS
	boolean getStatus();
	
	String getReason();
	
	Object getReturn();
}
