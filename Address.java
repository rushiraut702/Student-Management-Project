public class Address
{
	private String area, city, state;
	private int pincode;

	public Address(String area, String city, String state, int pincode)
	{
		super();
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	@Override
	public String toString()
	{
		return "Address [ area = "+area+ ", city = "+city+", state = "+state+", pincode = "+pincode+"]";
	}
}
