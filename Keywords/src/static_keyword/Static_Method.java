package static_keyword;

class Senarior1
{  
    int rollno;  
    String name;  
    static String college = "ITS";  
    //static method to change the value of static variable  
    static void change()
    {  
    	college = "BBDIT";  
    }  
    //constructor to initialize the variable  
    Senarior1(int r, String n)
    {  
    	rollno = r;  
    	name = n;  
    }  
    void display()
    {
    	System.out.println(rollno+" "+name+" "+college);
    }  
}
class Senarior2
{  
	static int cube(int x)
	{  
		return x*x*x;  
	}  
}
public class Static_Method {

	public static void main(String[] args)
	{
		Senarior1 s = new Senarior1(100,"Aryan"); 
		System.out.println("Before static method is called ");
		s.display();
		
		Senarior1.change();//calling change method  
		Senarior1 s1 = new Senarior1(111,"Karan");  
		Senarior1 s2 = new Senarior1(222,"Aryan");  
		Senarior1 s3 = new Senarior1(333,"Sonoo");  
	    //calling display method  
		System.out.println("After static method is called ");
	    s1.display();  
	    s2.display();  
	    s3.display();  
		
		int result=Senarior2.cube(5);  
		System.out.println("Senario 2: "+result);  
	}

}
