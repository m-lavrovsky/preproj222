package web.dao;


import web.model.Car;

import java.util.List;

public interface UserDao {

    List<Car> getCarList(int count);
}