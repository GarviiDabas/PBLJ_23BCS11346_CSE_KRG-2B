/*Question 4: Multithreading
What is Multithreading in java? Write a Java program that creates two threads:
Thread 1 prints numbers from 1 to 10.
Thread 2 prints the square of numbers from 1 to 10.*/

package MST1;
import java.util.*;

class num extends Thread{
	public void run(){
		for(int i = 1; i <= 10; i ++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class square extends Thread{
	public void run(){
		for(int i = 1; i <= 10; i ++) {
			System.out.println(i * i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class Q2 {
public static void main(String args[]) {
	num t1 = new num();
	square t2 = new square();
	t1.start();
	t2.start();
}
}
