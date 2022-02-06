package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.Math.min;

public class UserDaoImpl implements UserDao{
    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("BMW", "M5", "gray"));
        carList.add(new Car("Mercedes", "SL55", "white"));
        carList.add(new Car("Porsche", "911", "yellow"));
        carList.add(new Car("Nissan", "Skyline", "blue"));
        carList.add(new Car("Honda", "NSX", "red"));
    }

    public UserDaoImpl(){
    }

    public List<Car> getCarList(int count){
        return carList.stream().limit(count).toList();
    };
}
