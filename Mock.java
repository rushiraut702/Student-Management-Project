public class Mock
{
	private String subject, trainer, date, rating, batchCode;

	public Mock(String subject, String trainer, String date, String rating, String batchCode)
	{
		this.subject = subject;
		this.trainer = trainer;
		this.date = date;
		this.rating = rating;
		this.batchCode = batchCode;
	}

	@Override
	public String toString()
	{
		return "Mock [subject = "+ subject + ", trainer " + trainer + 
		", date = "+ date + ", rating "+ rating + ", batchCode = " + batchCode + "]" ;
	}
}