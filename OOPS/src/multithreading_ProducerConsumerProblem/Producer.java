package multithreading_ProducerConsumerProblem;

class Producer extends Thread 
{

	Company c;
	Producer(Company c)
	{
		this.c=c;
	}
	public void run()
	{ 
		int i=1;
		while(true)
		{
			try {
				this.c.produce_item(i);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try{Thread.sleep(1000);}catch(Exception e){}
			i++;
		}
	}
}
