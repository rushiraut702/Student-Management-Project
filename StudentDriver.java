import java.util.*;
public class StudentDriver
{
	static int indx = 0;
	static Student[] arr = new Student[10];

	public static void main(String[] args) {
		
		for(;;)
		{
			System.out.println("---------------Welcome---------------");
			System.out.println("1. ADD STUDENT");
			System.out.println("2. UPDATE STUDENT");
			System.out.println("3. ALL STUDENT");
			System.out.println("4. ADD MOCK");
			System.out.println("5. LOGOUT");

			System.out.println();
			System.out.println("Enter your option : ");
			switch(new java.util.Scanner(System.in).nextInt())
			{
				case 1 : {
					addStudent();
					break;
				}
				case 2 : {
					updateStudent();
					break;
				}
				case 3 : {
					viewAllStudent();
					break;
				}
				case 4 : {
					addMock();
					break;
				}
				case 5 : {
					System.exit(0);
					break;
				}
				default :{
					throw new IllegalArgumentException("INVALID INPUT");
				}
			}
		}
	}
	private static void addMock()
	{

	}

	private static void viewAllStudent()
	{
		System.out.println("ALL STUDENT LIST");
		if(arr[0] == null){
			System.out.println("NO DATA FOUND");
			return;
		}

		for(Student ele : arr)
		{
			System.out.println(ele);
		}
	}

	private static void updateStudent()
	{

	}

	private static void addStudent()
	{
		System.out.println("ADD STUDENT DETAILS");
		System.out.println("Name : ");
		String name = new Scanner(System.in).nextLine();
		System.out.println("Email : ");
		String emailId = new Scanner(System.in).next();
		System.out.println("Contact : ");
		long contact = new Scanner(System.in).nextLong();
		Address address = addAddress();

		Student student = new Student(name, emailId, contact, address);

		arr[indx++] = student;
	}
	private static Address addAddress()
	{
		System.out.println("ADDRESS DETAILS : ");
		System.out.println("Area : ");
		String area = new Scanner(System.in).nextLine();
		System.out.println("City : ");
		String city = new Scanner(System.in).nextLine();
		System.out.println("State : ");
		String state = new Scanner(System.in).nextLine();
		System.out.println("Pincode : ");
		int pincode = new Scanner(System.in).nextInt();


		return new Address(area, city, state, pincode);
	}

}