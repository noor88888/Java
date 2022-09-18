package this_keyword;
class Test_method
{
    int val1;
    int val2;
    Test_method()
    {
        val1 = 10;
        val2 = 20;
    } 
    void printVal(Test_method obj)
    {
             System.out.println("val1 = " + obj.val1 + "  val2 = " + obj.val2);
    }
    void get()
    {
           printVal(this);
    }
}
public class Passing_AsMethod_Parameter {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Test_method object = new Test_method();
        object.get();
	}

}
