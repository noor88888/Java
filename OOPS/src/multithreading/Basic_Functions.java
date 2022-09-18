package multithreading;

public class Basic_Functions 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getId());
		System.out.println(t.getState());
		try {
			t.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("This line printed after 8sec");
		t.setName("MyThread");
		System.out.println("Name changed after using set name function: "+t.getName());
		System.out.println(t.getState());
		
	}

}
