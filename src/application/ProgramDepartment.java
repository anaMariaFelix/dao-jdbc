package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class ProgramDepartment {

	public static void main(String[] args) {

		DepartmentDAO depDao = DaoFactory.createDepartmentDao();
		
//		System.out.println("===Test 1 insert===");
//		Department dep = new Department(1,"x");
//		depDao.insert(dep);
//		System.out.println("Department: "+ dep);
//		System.out.println();
		
//		System.out.println("===Test 2 removeById===");
//		depDao.deleteById(6);
//		System.out.println("Remove conluido!");
		
//		System.out.println("===Test 3 update===");
//		dep = new Department(7,"x");
//		dep.setNome("Limpeza");
//		depDao.update(dep);
//		System.out.println("upadate conluido! " + dep);
		

//		System.out.println("===Test 4 finById===");
//		Department depId = depDao.findById(2);
//		System.out.println(depId);
		
		System.out.println("===Test 5 finAll===");
		List<Department> list = depDao.findAll();
		list.forEach(System.out::println);
	}

}
