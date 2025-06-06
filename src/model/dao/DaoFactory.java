package model.dao;

import db.DB;
import model.dao.impl.DepartmentImplJDBC;
import model.dao.impl.SellerDaoImplJDBC;

public class DaoFactory {

	public static SellerDAO createSellerDao() {//instancia um obj e estabelece a conexao com o banco
		return new SellerDaoImplJDBC(DB.getConnection());
	}
	
	public static DepartmentDAO createDepartmentDao() {//instancia um obj e estabelece a conexao com o banco
		return new DepartmentImplJDBC(DB.getConnection());
	}
}
