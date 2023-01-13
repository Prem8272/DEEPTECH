class movie //class name
{
	//instance variables
	String title;
	String studio;
	String rating;
	//constructor
	public movie(String title,String studio,String rating)//constructor with 3 arguments
	{
		this.title=title;
		this.studio=studio;
		this.rating=rating;
	}
	public movie(String title,String studio)//constructor with 2 arguments
	{
		this.title=title;
		this.studio=studio;
	}
	//getter and setter function for ratings
	public String getRating()
	{
		return rating;
	}
	public void setRating(String rating)
	{
		this.rating=rating;
	}
	//main function
	public static void main(String[] a)
	{
		movie m=new movie("Casino Royale","Eon Productions","PG-13");//Frist object created
		movie n=new movie("Avatar:The way of water","Paramount Pictures");second object created
		System.out.println("----First Constructor values display----\nMovie title:-" +m.title);
		System.out.println("Studio name:-" +m.studio);
		System.out.println("Ratings:-" +m.rating);
		System.out.println();
		System.out.println("----Second constructor values display----\nMovie title:-" +n.title);
		System.out.println("Studio name:-" +n.studio);
		m.setRating("PG-14");
		System.out.println(m.getRating());
		
		
	}
}
			