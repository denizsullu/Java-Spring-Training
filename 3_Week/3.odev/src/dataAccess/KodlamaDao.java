package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public interface KodlamaDao {
	void writeInstructor(Instructor instructor);
	void writeCourse(Course course);
	void writeCategory(Category category);
}
