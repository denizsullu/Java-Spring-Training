package entities;

public class Course {
	private String coursName;
	private int coursPrice;
	public Course(String coursName, int coursPrice) {
		super();
		this.coursName = coursName;
		this.coursPrice = coursPrice;
	}
	public String getCoursName() {
		return coursName;
	}
	public void setCoursName(String coursName) {
		this.coursName = coursName;
	}
	public int getCoursPrice() {
		return coursPrice;
	}
	public void setCoursPrice(int coursPrice) {
		this.coursPrice = coursPrice;
	}
	
}
