class Holiday //class name
{
	//instance variables
	String name;
	int day;
	String month;
	//Constructor
	public Holiday(String n,int d,String m)//constructor with 3 arguments
	{
		this.name=n;
		this.day=d;
		this.month=m;
		
	}
//Main funcion		
public static void main(String[] a)
{
	//object created for the class
	Holiday h=new Holiday("Independance Day",15,"August");
	System.out.println(h.name);
	System.out.println(h.day);
	System.out.println(h.month);
}	
}
