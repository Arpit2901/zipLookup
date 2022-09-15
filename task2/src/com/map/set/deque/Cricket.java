package com.map.set.deque;

public class Cricket {
	
	private long runs;
	
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}
	
	@Override
	public String toString() {
		return "Cricket [runs=" + runs + "]";
	}
	public Cricket( long runs) {
		
		this.runs = runs;
	}
}
