package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import javax.transaction.SystemException;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoJDBCImpl();
    public void createUsersTable() throws SystemException {
        userDao.createUsersTable();
    }

    public void dropUsersTable() {
        userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        List <User> userList;
        userList = userDao.getAllUsers();
        return userList;
    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }
}