package day26.threadings.part3.deadlock;

public class Pen {

	
	public synchronized void write(Notebook notebook) {
		System.out.println(Thread.currentThread().getName() +" got Pen");
		
		try {
			System.out.println(Thread.currentThread().getName()  +" sleeping for 1 sec");
			Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName() + " waiting for notebook");
		notebook.use();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
		
	}
}
