package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.User;

public class UserDaoImpl extends Dao implements UserDao {

	@Override
	public void add(User user) {

		Connection conn = getConnection();
		Statement st = null;
		String sql = "INSERT INTO list_users(surname, name, secondName, phoneNumber) VALUES('" + user.getSurname()
				+ "', '" + user.getName() + "', '" + user.getSecondName() + "', '" + user.getPhoneNumber() + "')";
		try {
			st = conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void update(User user) {

		Connection conn = getConnection();
		Statement st = null;
		String sql = "UPDATE list_users SET surname = '" + user.getSurname() + "', name = '" + user.getName()
				+ "', secondName = '" + user.getSecondName() + "', phoneNumber = '" + user.getPhoneNumber()
				+ "' WHERE id = '" + user.getId() + "'";
		try {
			st = conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void delete(int id) {

		Connection conn = getConnection();
		Statement st = null;
		String sql = "DELETE FROM list_users WHERE id= '" + id + "'";
		try {
			st = conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public User getById(int id) {

		Connection conn = getConnection();
		Statement st = null;
		String sql = "SELECT * FROM list_users WHERE id = '" + id + "'";
		User user = new User();
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			rs.next();
			user.setId(rs.getInt(1));
			user.setSurname(rs.getString(2));
			user.setName(rs.getString(3));
			user.setSecondName(rs.getString(4));
			user.setPhoneNumber(rs.getString(5));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return user;
	}

	@Override
	public List<User> getAll() {

		Connection conn = getConnection();
		Statement st = null;
		String sql = "SELECT * FROM list_users";
		User user = null;
		List<User> users = new ArrayList<User>();
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				user = new User();
				user.setId(rs.getInt(1));
				user.setSurname(rs.getString(2));
				user.setName(rs.getString(3));
				user.setSecondName(rs.getString(4));
				user.setPhoneNumber(rs.getString(5));
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return users;
	}

	@Override
	public List<User> getByName(String name) {

		Connection conn = getConnection();
		Statement st = null;
		String sql = "SELECT * FROM list_users WHERE name = '" + name + "'";
		User user = null;
		List<User> users = new ArrayList<User>();
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				user = new User();
				user.setId(rs.getInt(1));
				user.setSurname(rs.getString(2));
				user.setName(rs.getString(3));
				user.setSecondName(rs.getString(4));
				user.setPhoneNumber(rs.getString(5));
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return users;
	}

	@Override
	public List<User> getBySurname(String surname) {
		Connection conn = getConnection();
		Statement st = null;
		String sql = "SELECT * FROM list_users WHERE surname = '" + surname + "'";
		User user = null;
		List<User> users = new ArrayList<User>();
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				user = new User();
				user.setId(rs.getInt(1));
				user.setSurname(rs.getString(2));
				user.setName(rs.getString(3));
				user.setSecondName(rs.getString(4));
				user.setPhoneNumber(rs.getString(5));
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return users;
	}

}
