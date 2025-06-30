import java.util.*;
public class Student 
{
	static int unqid = 123;
	private String id, name, emailId ;
	private long contact;
	private Address address;
	private Education[] education = new Education[5];
	private Mock[] mock = new Mock[5];

	{
		id = "QSP" + unqid++;
	}

	public Student(String name, String emailId, long contact, Address address)
	{
		super();
		this.name = name;
		this.emailId = emailId;
		this.contact = contact;
		this.address = address;
		this.education = addEducation();
	}
	private Education[] addEducation()
	{
		Education[] arr = new Education[5];
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print("Enter your Education Details : \n");
			System.out.print("Course :");
			String course = new Scanner(System.in).nextLine();
			System.out.print("University : ");
			String university = new Scanner(System.in).nextLine();
			System.out.print("YOP : ");
			int yop = new Scanner(System.in).nextInt();
			System.out.print("CGPA : ");
			double cgpa = new Scanner(System.in).nextDouble();

			Education edu = new Education(course, university, yop, cgpa);
			arr[i] = edu;
			System.out.println();
			System.out.println("Do u want to add more edu details (YES/NO) : ");
			String resp = new Scanner(System.in).next();
			if(resp.equals("NO"))break;
		}
		return arr;
	}

	@Override
	public String toString()
	{
		return "Student [name = "+name+", emailId = "+emailId+", contact = "+contact+", address = "+address+"]";
	}
}