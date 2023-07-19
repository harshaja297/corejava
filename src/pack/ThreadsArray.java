package pack;

public class ThreadsArray extends Thread {//

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName()+" hi");
		
	}
	
	
	public static void main(String[] args) {
		ThreadsArray t0= new ThreadsArray();
		ThreadsArray t1= new ThreadsArray();
		ThreadsArray t2= new ThreadsArray();
		ThreadsArray t3= new ThreadsArray();
		
		
		
		ThreadsArray [] aot= {t0, t1, t2, t3}; 
		
		for(ThreadsArray t: aot) {
			t.start();
		}
		
		
		
		
	}
}
