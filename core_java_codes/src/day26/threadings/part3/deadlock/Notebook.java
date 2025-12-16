package day26.threadings.part3.deadlock;

public class Notebook {

	
	public synchronized void use() {
		System.out.println(Thread.currentThread().getName() +" got notebook");
		
		try {
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() +" Holding Notebook for 2 sec");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
