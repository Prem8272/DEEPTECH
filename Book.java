class Book//class name
{	
	//instance variables
	String name;
	String author;
	long ISBN;
	
	//Getter and Setter functions
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public long getISBN()
	{
		return ISBN;
	}
	public void setISBN(long ISBN)
	{
		this.ISBN=ISBN;
	}
	
	//Main function
	public static void main(String[] a) 
	{
		Book b=new Book(); //object creation 
		b.setName("Animals on the farm");
		b.setAuthor("Bramptom, Bob");
		b.setISBN(1858544424);
		System.out.println("Name of the book : " +b.getName());
		System.out.println("Book Author : "+b.getAuthor());
		System.out.println("ISBN Number : "+b.getISBN());
	}
}
	