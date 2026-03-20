package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {

	List<Department> list = new ArrayList<Department>();

	public List<Department> findAll() {
		if (list.size() < 3) {
			list.add(new Department(1, "Books"));
			list.add(new Department(2, "Computers"));
			list.add(new Department(3, "Electronics"));
		}
		return list;
	}

	public void saveOrUpdate(Department obj) {

		if (obj.getId() == null) {
			System.out.println("ADD");
		} else {
			System.out.println("UPDATE");
		}
	}
	
	public void remove(Department obj) {
		System.out.println("REMOVE");
	}
}
