package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.UserServiceImpl;

import java.util.List;

@Controller
public class CarController {
    private UserServiceImpl userService = new UserServiceImpl();

    @GetMapping(value = "/cars")
    public String printCars(Model model, @RequestParam(required = false) Integer count) {
        if (count != null) {
            if ((count < 1) || (count > 5)) {
                count = 5;
            }
        }
        else {
            count = 5;
        }

        model.addAttribute("descr","Отображается машин: " + count);
        model.addAttribute("cars", userService.getCarList(count));
        return "cars";
    }

}