import java.util.ArrayList;
import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import business.EducatorManager;
import core.DatabaseLogger;
import core.EmailLogger;
import core.Logger;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbcEducatorDao;
import entities.Category;
import entities.Course;
import entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
		
		List<Logger> loggers = new ArrayList<>();
		
		List<Course> courses = new ArrayList<>();
		List<Category> categories = new ArrayList<>();
		List<Educator> educators = new ArrayList<>();
		
		loggers.add(new EmailLogger());
		loggers.add(new DatabaseLogger());
		
		// KURS EKLEME KISMI*****************************
		System.out.println("*** Course ***");
		
	 	Course course1 = new Course(1,"Engin Demiroğ",200);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
		courseManager.add(course1);
		
		// KATEGORİ EKLEME KISMI*****************************
		System.out.println("*** Category ***");
		
		Category category1 = new Category(1, "JAVA");
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categories);
		categoryManager.add(category1);
		
		// EĞİTMEN EKLEME KISMI*****************************
		System.out.println("*** Educator ***");
				
		Educator educator1 = new Educator(1," Engin Demiroğ ");
		
		EducatorManager educatorManager = new EducatorManager(new JdbcEducatorDao(), loggers, educators);
		educatorManager.add(educator1);
	}
}
