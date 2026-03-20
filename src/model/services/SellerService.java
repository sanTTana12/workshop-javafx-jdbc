package model.services;

import java.util.ArrayList;
import java.util.List;
import model.entities.Seller;

public class SellerService {

	List<Seller> list = new ArrayList<Seller>();

	public List<Seller> findAll() {
		if (list.size() < 3) {
			list.add(new Seller(1, "Books"));
			list.add(new Seller(2, "Computers"));
			list.add(new Seller(3, "Electronics"));
		}
		return list;
	}

	public void saveOrUpdate(Seller obj) {

		if (obj.getId() == null) {
			System.out.println("ADD");
		} else {
			System.out.println("UPDATE");
		}
	}
	
	public void remove(Seller obj) {
		System.out.println("REMOVE");
	}
}
