//Electricity bill Generator

class ElectricBill //name of the class
{
	//Global varibales
	int unit=65;
	int units=unit;
	int bill;
	public void cal()
	{
	
		if(units<=100)
		{
			bill=units*10;
		}
		else if(units>100 && units<=200)
		{
		
			bill=(units*15);
		}
		else if(units>200 && units<=300)
		{
		
			bill=(units*20);
		}
		else 
		{
			bill=(units*25);
		}
	}
	public void display()
	{
		System.out.println("Bill for "+unit+" Units is Rs."+bill);
	}
	
	//main method
	public static void main(String[] a)
	{
		ElectricBill eb=new ElectricBill();//object creation

		//calling function with object name
		eb.cal();
		eb.display();
	}
}