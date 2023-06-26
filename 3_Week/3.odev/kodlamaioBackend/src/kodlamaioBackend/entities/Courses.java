package kodlamaioBackend.entities;

public class Courses {
	private String instructor;
	private String category;
	private String coursesName;
	private int coursesPrice;
	
	public Courses(String instructor, String category, String coursesName, int coursesPrice) {
		this.instructor = instructor;
		this.category = category;
		this.coursesName = coursesName;
		this.coursesPrice = coursesPrice;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCoursesName() {
		return coursesName;
	}
	public void setCoursesName(String coursesName) {
		this.coursesName = coursesName;
	}
	public int getCoursesPrice() {
		return coursesPrice;
	}
	public void setCoursesPrice(int coursesPrice) {
		this.coursesPrice = coursesPrice;
	}
	
	

	
}
