package model.services;

import java.util.ArrayList;
import java.util.List;

import gui.util.Alerts;
import javafx.scene.control.Alert.AlertType;
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
			Alerts.showAlert("SAVE", null, "Saved", AlertType.INFORMATION);
		} else {
			Alerts.showAlert("UPDATE", null, "Updated", AlertType.INFORMATION);
		}
	}
	
	public void remove(Department obj) {
		Alerts.showAlert("REMOVE", null, "The content was removed", AlertType.INFORMATION);
	}
}
