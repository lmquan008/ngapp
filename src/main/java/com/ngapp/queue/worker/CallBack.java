package com.ngapp.queue.worker;

import java.util.concurrent.Callable;

/**
 * Call Back is used when the result is returned
 * @author QuanLe
 *
 */
public interface CallBack{
	NGResult getResult();
	void callBack();
}
