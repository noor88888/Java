package this_keyword;


class This_construct
{
     int val1;
     int val2;
 
    //Default constructor
    This_construct()
    {   
        this(10, 20);
        System.out.print("Default constructor " +"val1 :"+ val1 +" ,"+ "val2 :"+val2);
    }
    //Parameterized constructor
   This_construct(int val1, int val2)
    {
        this.val1 = val1;
        this.val2 = val2;
        System.out.println("Parameterized constructor");
    }
}
public class Call_Current_ClassConstructor {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		This_construct object = new This_construct();
	}

}
