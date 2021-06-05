package com.example.crud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class CrudApplication {

    ArrayList<String> listOfUsers = new ArrayList<String>();
    private Logger logger = LoggerFactory.getLogger(CrudApplication.class);

    @GetMapping("/users")
    @ResponseBody
    public String showAllUsers() {
        logger.info("Users are returned {}", listOfUsers);
        return listOfUsers.toString();
    }

    @PostMapping("/add-user/{user}")
    @ResponseBody
    public String addUser(@PathVariable("user") String newUser) {
        logger.error("User to add: {}", newUser);
        listOfUsers.add(newUser);
        logger.debug("Current users in list: {}", listOfUsers);
        return newUser + " has been added!";
    }

    @PutMapping("/update-user/{oldUser}/{newUser}")
    @ResponseBody
    public String updateUser(@PathVariable("oldUser") String oldUser, @PathVariable("newUser") String newUser) {

        int index = listOfUsers.indexOf(oldUser);

        logger.error("User to update: {}", oldUser);
        listOfUsers.set(index, newUser);
        logger.debug("Current users in list: {}", listOfUsers);

        return "Updated user " + oldUser + " to " + newUser;
    }

    @DeleteMapping("/delete-user/{deleteUser}")
    @ResponseBody
    public String deleteUser(@PathVariable("deleteUser") String user){
        logger.info("User to delete: {}", user);
        listOfUsers.remove(user);
        logger.debug("Current users in list: {}", listOfUsers);

        return "Deleted user: " + user;
    }

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }

}
