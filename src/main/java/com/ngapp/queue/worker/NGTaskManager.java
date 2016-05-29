package com.ngapp.queue.worker;

public interface NGTaskManager {
	void assignTaskAndLeave();
	void assignTaskAndWait();
}
