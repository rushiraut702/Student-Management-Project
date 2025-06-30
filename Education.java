import java.util.*;
class Education
{
	private String course, university;
	private int yop;
	private double cgpa;

	public Education(String course, String university, int yop, double cgpa)
	{
		super();
		this.course = course;
		this.university = university;
		this.yop = yop;
		this.cgpa = cgpa;
	}

	@Override
	public String toString()
	{
		return "Education [course = " + course + ", university = " + university + ", YOP : "+yop + ", CGPA = " +cgpa+ "]";
	}
}


