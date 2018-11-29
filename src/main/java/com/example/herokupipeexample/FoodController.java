package com.example.herokupipeexample;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

    private FoodRepository foodRepository;

    public FoodController(FoodRepository foodRepository) {
      this.foodRepository = foodRepository;
    }

    @RequestMapping("/")
    public String welcome() {
        return "Welcome to this small REST service. It will accept a GET on /list with a request parameter name, and a POST to / with a JSON payload with name as returned value.";
    }

    @RequestMapping("/list")
    public List<Food> find(@RequestParam(value="name") String name) {
        return foodRepository.findByName(name);
    }

    @PostMapping("/")
    	Food newFood(@RequestBody Food food) {
        System.out.println(food);
    		return foodRepository.save(food);
    	}

}
