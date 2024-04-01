package JavaBasics01;

// Two ways to create multithreadable class.

public class MultithreadThing implements Runnable {
	
	private int threadNumber;
	
	public MultithreadThing (int thread) {
		this.threadNumber = thread;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " from thread " + threadNumber);
			
			// if theres an exception in one of the threads, all the other threads wont be affected.
//			if (threadNumber == 3) {
//				throw new RuntimeException();
//			}
			
			try {
				Thread.sleep(500);
			}
			catch (InterruptedException e) {
				
			}
		}
	}
}

//public class MultithreadThing extends Thread {
//	
//	private int threadNumber;
//	
//	public MultithreadThing (int thread) {
//		this.threadNumber = thread;
//	}
//	
//	@Override
//	public void run() {
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i + " from thread " + threadNumber);
//			
//			// if theres an exception in one of the threads, all the other threads wont be affected.
////			if (threadNumber == 3) {
////				throw new RuntimeException();
////			}
//			
//			try {
//				Thread.sleep(500);
//			}
//			catch (InterruptedException e) {
//				
//			}
//		}
//	}
//}
