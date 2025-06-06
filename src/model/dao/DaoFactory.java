package model.dao;

import model.dao.impl.SellerDaoImplJDBC;

public class DaoFactory {

	public static SellerDAO createSellerDao() {
		return new SellerDaoImplJDBC();
	}
}
