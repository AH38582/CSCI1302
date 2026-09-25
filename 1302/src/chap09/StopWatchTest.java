package chap09;

public class StopWatchTest {

	public static void main(String[] args) {
		StopWatch s = new StopWatch();
		s.start();

		s.stop(825588);
		System.out.println(s.getElapsedTime());
	}

}

class StopWatch {
	// private data fields
	private long startTime, endTime;

	// default constructor that initializes startTime with endTime
	public StopWatch() {
		startTime = System.currentTimeMillis();
	}

	// accessor methods for startTime and endTime
	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	// start() method resets the startTime to the current time

	public void start() {
		startTime = System.currentTimeMillis();
	}

	// stop() method sets the endTime to the current time
	public void stop(long endTime) {
		this.endTime = endTime;
	}

	// getElaspsedTime() method returns the elapsed time in milliseconds
	public long getElapsedTime() {
		return getEndTime() - getStartTime();
	}

}