package dataAccess;

import entities.Educator;

public class JdbcEducatorDao implements IEducatorDao{

	@Override
	public void add(Educator educator) {
		System.out.println("JDBC ile veri tabanına eklendi");
	}
}
