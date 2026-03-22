package model.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import gui.util.Alerts;
import javafx.scene.control.Alert.AlertType;
import model.entities.Seller;

public class SellerService {

	List<Seller> list = new ArrayList<Seller>();

	public List<Seller> findAll() {
		list.add(new Seller(1, "Maria", "maria@gmail.com", null, 200.0));
		return list;
	}

	public void saveOrUpdate(Seller obj) {

		if (obj.getId() == null) {
			Alerts.showAlert("SAVE", null, "Saved", AlertType.INFORMATION);
		} else {
			Alerts.showAlert("UPDATE", null, "Updated", AlertType.INFORMATION);
		}
	}
	
	public void remove(Seller obj) {
		Alerts.showAlert("REMOVE", null, "The content was removed", AlertType.INFORMATION);
	}
}
