package JavaBasics01;

public class Multithreading {

	public static void main(String[] args) {
		/***
		MultithreadThing myThing = new MultithreadThing();
		MultithreadThing myThing2 = new MultithreadThing();
		
		// prints the first run, then the second run.
		myThing.run();
		myThing.run();
		
		// both starts and prints at the same time.
		myThing.start();
		myThing2.start();
		***/
		
		// easy way to do a whole bunch of multithreading.
		for (int i = 0; i < 5; i++) {
			MultithreadThing myThing3 = new MultithreadThing(i);
			Thread myThread = new Thread(myThing3); // one more line to add if using implements Runnable.
			myThread.start();
			try {
				myThread.join();
				System.out.println(myThread.isAlive());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}