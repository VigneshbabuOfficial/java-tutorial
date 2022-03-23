package basics.multithread;

public class MultithreadExample1 implements Runnable {

	@Override
	public void run() {
		System.out.println("Runnable run method");
	}

	public static void main(String[] args) {

		MultithreadExample1 t1 = new MultithreadExample1();
		Thread th = new Thread(t1);
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t1);
		th.start();
		th1.start();
		th2.start();
	}

}
