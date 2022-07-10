package multithread;

public class TestThread implements Runnable {
	
	private String name;
	
	public TestThread(String name){
		this.name = name;
	}

	public void run() {
		System.out.println(name + " start.");
		System.out.println(name + " running.");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + " end.");
	}

}
