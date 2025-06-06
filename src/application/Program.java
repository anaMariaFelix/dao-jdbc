package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDAO sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test 1: Seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println();
		
		System.out.println("=== Test 2: Seller findByDepartment ===");
		Department dep = new Department(2,null);//como meu metodo precisa de um department foi feito essa instancia normal so para pode pa
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		list.forEach(System.out::println);
		System.out.println();
		
		System.out.println("=== Test 3: Seller findByAll ===");
		//list = sellerDao.findAll();
		
		list.forEach(System.out::println);
		
		
		System.out.println("=== Test 4: Seller insert ===");
		Seller newSeller = new Seller(1, "pitoco", "pitoco@123", new Date(), 400.00, dep);
		sellerDao.insert(newSeller);
		
		System.out.println("Inserte new Id! "+ newSeller.getId());
		
	}

}
