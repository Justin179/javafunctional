package multithread;

public class TestDemo {

	public static void main(String[] args) {
		System.out.println("main thread start");
		
		Thread thread = new Thread(new TestThread("thread"));
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main thread end");
	}

}
