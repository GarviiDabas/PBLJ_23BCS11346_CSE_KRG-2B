package EST;
class SharedPrinter {
	private int number = 1;
	private final int max = 15;
	
	public synchronized void printOdd() {
		while(number <= max) {
			while(number % 2 == 0) {
				try {
					wait();
				}
				catch(InterruptedException e) {
				}}
				if(number <= max) {
				System.out.println(number);
				number ++;
				
				notify();
			}
		}
	}
	
	public synchronized void printEven() {
		while(number <= max) {
			while(number % 2 != 0) {
				try {
					wait();
				}
				catch(InterruptedException e){
				}}
				if(number <= max) {
				System.out.println(number);
				number ++;
				
				notify();
			}
		}
	}
}

public class Q01 {
public static void main(String args[]) {
	SharedPrinter sp = new SharedPrinter();
	
	Thread t1 = new OddThread(sp);
	Thread t2 = new EvenThread(sp);
	
	t1.start();
	t2.start();
}
}

class OddThread extends Thread {
	SharedPrinter sp;
	OddThread(SharedPrinter sp){
		this.sp = sp;
	}
	
	public void run() {
		sp.printOdd();
	}
}
class EvenThread extends Thread {
	SharedPrinter sp;
	EvenThread(SharedPrinter sp){
		this.sp = sp;
	}
	
	public void run() {
		sp.printEven();
	}
}
