//Employee Bonus Generator
class Employee//name of the class
{
	//Global variables
	int ex=10;
	double bonus;
	double bsalary=34000,salary;

	public void bonus()
	{
		if(ex<=4)
		{
			bonus=(bsalary*5/100);
			salary=bsalary+bonus;
		}
		else if(ex>4 && ex<=9)
		{
			bonus=(bsalary*10/100);
			salary=bsalary+bonus;
		}
		else
		{
			bonus=(bsalary*15/100);
			salary=bsalary+bonus;
		}
	}
	public void dis()
	{
		System.out.println("Experience = "+ex+"	\nBasic Salary = "+bsalary+" \nBonus = "+bonus+" \nTotal Salary= "+salary);
	}

	//main method
	public static void main(String[] a)
	{
		Employee e=new Employee();//object creation
		//calling function with object name
		e.bonus();
		e.dis();
	}
}