package service;

import java.util.List;

import dao.UserDao;
import dao.UserDaoImpl;
import entity.User;

public class Notepad {

	UserDao record = new UserDaoImpl();

	public void addRecord(User user) {
		record.add(user);
	}

	public void changeRecord(User user) {
		record.update(user);
	}

	public void deleteRecord(int id) {
		record.delete(id);
	}

	public User chooseRecordById(int id) {
		return record.getById(id);
	}

	public List<User> chooseAllRecords() {
		return record.getAll();
	}

	public List<User> chooseRecordsByName(String name) {
		return record.getByName(name);
	}

	public List<User> chooseRecordsBySurname(String surname) {
		return record.getBySurname(surname);
	}
}
