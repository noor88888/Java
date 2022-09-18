package private_;
class AB  
{  
	 private  void display()  
	 {  
	     System.out.println("parent class");  
	 }  
	 void show()
	 {
		 display();
	 }
}  
class BA extends AB
{
	void display()  
	 {  
	     System.out.println("child class");  
	 }  	
}
public class Private_Method
{
	public static void main(String[] args)
	{
		AB a=new AB();
		a.show();//acessable as it is same class
		//a.display(); gives error
		AB a1=new BA(); 
		//a1.display(); gives error  
	}
}
