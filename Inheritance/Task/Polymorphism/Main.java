public class Main
{
	public static void main(String[] args) 
	{
	    String str="ezhil";
    String str1="ezhil";
    System.out.println("str: "+str.hashCode());
    System.out.println("str: "+str1.hashCode());
    String s=new String("ezhil");
    String s1=new String("ezhil");
    System.out.println("s: "+s.hashCode());
    System.out.println("s1: "+s1.hashCode());
	}
}