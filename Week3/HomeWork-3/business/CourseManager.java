package business;

import java.util.List;

import core.Logger;
import dataAccess.ICourseDao;
import entities.Course;

public class CourseManager implements ICourseService{
	
	private List<Course> courses;
	private List<Logger> loggers;
	private ICourseDao courseDao;
	
	public CourseManager(ICourseDao courseDao, List<Logger> loggers ,List<Course> courses) {
		this.courses = courses;
		this.loggers = loggers;
		this.courseDao = courseDao;
	}
	
	@Override
	public void add(Course course) throws Exception{
		for(Course courseNew: courses) {
			if(courseNew.getName().equals(course.getName())) {
				throw new Exception("Bu kurs daha önce eklendi.");
			}
		}
		if(course.getPrice()<0) {
			throw new Exception("Kurs ücreti 0'dan küçük olamaz");
		}
		courses.add(course);
		courseDao.add(course);

		for(Logger loggerNew:loggers) {
			loggerNew.log("Yeni kurs eklendi" + course.getName());
		}
	}
}
