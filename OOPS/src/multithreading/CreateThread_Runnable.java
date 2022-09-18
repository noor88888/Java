package multithreading;
class Create_Runnable implements Runnable
{
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		System.out.println("Thread created by implementing runnable");
	}
	
}
public class CreateThread_Runnable 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Create_Runnable cr=new Create_Runnable();
		Thread t1=new Thread(cr);
		t1.start();
		t1.start();//Gives exception
	}

}
