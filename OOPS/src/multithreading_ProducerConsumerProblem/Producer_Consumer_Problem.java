package multithreading_ProducerConsumerProblem;

public class Producer_Consumer_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company comp=new Company();
		Producer p=new Producer(comp);
		Consumer c=new Consumer(comp);
		p.start();
		c.start();
	}

}
