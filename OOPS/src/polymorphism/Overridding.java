package polymorphism;
class Parent 
{
    void Print()
    {
        System.out.println("parent class");
    }
    void Show()
    {
    	System.out.println("parent class show method");
    }
}
class subclass1 extends Parent 
{
    void Print()
    {
    	System.out.println("subclass1"); 
    }   
}
class subclass2 extends Parent 
{
    void Print()
    {
        System.out.println("subclass2");
    }
}
public class Overridding 
{
	public static void main(String[] args) 
	{
		Parent p=new Parent();
		p.Print();
		Parent p1=new subclass1();
		p1.Print();
		p1.Show();
		Parent p2=new subclass2();
		p2.Print();
	}
}
