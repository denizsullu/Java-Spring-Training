package entities;

public class Course {
	private String coursName;
	private int price;
	public Course(String coursName, int price) {
		super();
		this.coursName = coursName;
		this.price = price;
	}
	public String getCoursName() {
		return coursName;
	}
	public void setCoursName(String coursName) {
		this.coursName = coursName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
