package private_;
class A  
{  
	private  String msg="Noor"; 
	//String msg="Noor" this gives error
	void display()
	{
		System.out.println(msg+" Private variable accessed in same class ");//can be accessed
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	;
}  
class B extends A
{
	String msg="Ahamed"; //if we comment this string then it gives error because we cant access it outside class
	void display()
	{
		System.out.println(msg+ " Private variable of child class invoked");//can be accessed
	}
}
public class Private_Variable {

	public static void main(String[] args) 
	{
		
		A a=new A(); 
		a.display(); 
		
		A a1=new A(); 
		a1.setMsg("Hi private variable changed");//We can only change the private varible bt using getter n setters
		System.out.println(a1.getMsg());
		
		A b=new B();
		b.display();//child class will be invoked
		//System.out.println(a.msg);  //we will get error because we r trying to access from outside class
	}

}
