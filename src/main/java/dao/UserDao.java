package dao;

import java.util.List;

import entity.User;

public interface UserDao {

	void add(User user);

	void update(User user);

	void delete(int id);

	User getById(int id);

	List<User> getAll();

	List<User> getByName(String name);

	List<User> getBySurname(String surname);

}
