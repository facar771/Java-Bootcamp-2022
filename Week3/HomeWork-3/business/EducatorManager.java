package business;

import java.util.List;

import core.Logger;
import dataAccess.IEducatorDao;
import entities.Educator;

public class EducatorManager implements IEducatorService{
	
	private List<Educator> educators;
	private List<Logger> loggers;
	private IEducatorDao educatorDao;
	
	public EducatorManager(IEducatorDao educatorDao, List<Logger> loggers ,List<Educator> educators) {
		this.educatorDao = educatorDao;
		this.educators = educators;
		this.loggers = loggers;
	}
	
	@Override
	public void add(Educator educator) throws Exception{
		
		educators.add(educator);
		educatorDao.add(educator);
		
		for(Logger loggerNew:loggers) {
			loggerNew.log("Yeni eğitmen eklendi" + educator.getName());
		}
	}
}
