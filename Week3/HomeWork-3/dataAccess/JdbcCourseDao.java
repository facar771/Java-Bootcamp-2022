package dataAccess;

import entities.Course;

public class JdbcCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile veri tabanına eklendi");
	}
}
