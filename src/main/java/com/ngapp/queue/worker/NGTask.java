package com.ngapp.queue.worker;

import java.io.Serializable;
import java.util.concurrent.Callable;

/**
 * 
 * Task will be process and store
 * 
 * @author QuanLe
 *
 */
public interface NGTask extends Serializable{
	void execute();
	void describe();
	void setCallBack(CallBack callBack);
	CallBack getCallBack();
	
	
}
