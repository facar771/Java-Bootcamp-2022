package dataAccess;

import entities.Educator;

public class HibernateEducatorDao implements IEducatorDao{

	@Override
	public void add(Educator educator) {
		System.out.println("Hibernate ile veri tabanına eklendi");
	}
}
