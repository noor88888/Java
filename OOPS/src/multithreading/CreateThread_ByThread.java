package multithreading;
class Create extends Thread
{
	public void run()
	{
		System.out.println("Thread started");
	}
}
public class CreateThread_ByThread 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Create c=new Create();
		c.start();
		c.start();//gives exception
	}

}
