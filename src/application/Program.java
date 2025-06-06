package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department dp = new Department(1,"TI");
		
		Seller s = new Seller(21, "ANA", "ANA@2123", new Date(), 3000.00,dp);
		System.out.println(s);
	}

}
