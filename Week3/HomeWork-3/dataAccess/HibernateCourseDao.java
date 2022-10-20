package dataAccess;

import entities.Course;

public class HibernateCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veri tabanına eklendi");
	}
}
