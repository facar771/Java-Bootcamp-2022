package business;

import java.util.ArrayList;
import java.util.List;

import core.Logger;
import dataAccess.ICategoryDao;
import dataAccess.ICourseDao;
import entities.Category;
import entities.Course;

public class CategoryManager implements ICategoryService{

	private List<Category> categories = new ArrayList<>();
	private List<Logger> loggers = new ArrayList<>();
	private ICategoryDao categoryDao;
	
	public CategoryManager(ICategoryDao categoryDao, List<Logger> loggers ,List<Category> categories) {
		this.categories = categories;
		this.loggers = loggers;
		this.categoryDao = categoryDao;
	}
	
	@Override
	public void add(Category category) throws Exception {
		for(Category categoryNew:categories) {
			if(categoryNew.getName().equals(category.getName())){
				throw new Exception("Bu kategori daha önce eklendi.");
			}
		}
		categories.add(category);
		categoryDao.add(category);
		
		for(Logger loggerNew:loggers) {
			loggerNew.log("Yeni kategori eklendi" + category.getName());
		}
	}
}
