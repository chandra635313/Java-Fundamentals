package multithreading;

public class RunnableDemo implements Runnable {

	Thread t;
	String threadname;

	RunnableDemo(String name) {
		threadname = name;
	}

	@Override
	public synchronized void run() {
		System.out.println("Inside run: Starting thread " + threadname);

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Running " + threadname);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void start() {
		System.out.println("Inside start");
		if (t == null) {
			t = new Thread(this);
			t.start();
		}
		System.out.println("Exiting Start method");
	}

	public static void main(String[] args) {
		RunnableDemo r1 = new RunnableDemo("mythread");
		r1.start();

		RunnableDemo r2 = new RunnableDemo("my another thread");
		r2.start();
	}

}
