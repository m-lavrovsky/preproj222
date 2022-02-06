package web.service;

import web.dao.UserDao;
import web.dao.UserDaoImpl;
import web.model.Car;
import java.util.List;

public class UserServiceImpl {
    private final UserDao userDAO;

    public UserServiceImpl () {userDAO = new UserDaoImpl();}

    public List<Car> getCarList(int count) {return userDAO.getCarList(count);}
}
