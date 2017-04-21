package multithreading;

/*
 Algorithm:
 
 1. 2 Strings (resources)
 2. Thread 1 gets lock on r1 and waits on r2 before relasing the r1 lock (same synchronized block)
 3. Thread 2 gets lock on r2 and waits on r1
 4. Result is a DEADLOCK
 */

public class Deadlock {

	public static void main(String[] args) {

		String r1 = "hello";
		String r2 = "there";

		Thread t1 = new Thread() {

			public void run() {
				synchronized (r1) {
					System.out.println("Thread 1: r1 locked");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (r2) {
						System.out.println("Thread 1: r2 locked");

					}
				}

			}

		};

		Thread t2 = new Thread() {

			public void run() {
				synchronized (r2) {
					System.out.println("Thread 2: r2 locked");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (r1) {
						System.out.println("Thread 2: r1 locked");

					}
				}

			}

		};

		t1.start();
		t2.start();
	}

}
