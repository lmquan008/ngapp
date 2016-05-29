package com.ngapp.queue.worker;

public enum NGResultEnum {
	FAILED(0),
	SUCCESS(1);	
	
	private int value;
	
    private NGResultEnum(int value) {
        this.value = value;
    }
    
    public int getValue() {
		return value;
	}
}
