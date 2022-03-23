package basics.multithread;

public class MultithreadExample extends Thread {

	@Override
	public void run() {
		super.run();
		System.out.println("Thread run method");
	}

	public static void main(String[] args) {

		MultithreadExample t = new MultithreadExample();
		t.start();
	}

}
