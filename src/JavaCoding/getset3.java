package JavaCoding;

public class getset3 {

	
	private String name ;
	private int rollno;
	
	
//	public int getRollno()
//	{
//		return this.rollno;
//	}
//	
//	public void setRollno(int rollno)
//	{
//		
//		if (rollno <=0)
//		{
//			System.out.println("roll no value should be greater than one ");
//			
//			throw new IllegalArgumentException();
//		}
//		
//		this.rollno= rollno;
//	}
//	
//	public String getName()
//	{
//		return this.name;
//	}
//	
//	public void setName(String name)
//	{
//		this.name=name;
//	}
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.rollno);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
}
