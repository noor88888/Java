package demo;

public interface Demo1 {
	
	public abstract void Demo2(int i);

}
class Demo3
{
public static void main(String args[])
{
	Demo1 d=(i)->System.out.println(i+"Hi");
	d.Demo2(5);
}
}