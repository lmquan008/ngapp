package com.ngapp.queue.worker;

import java.io.Serializable;

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
	NGResult getResult();
}
