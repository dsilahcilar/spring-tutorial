package com.example.web;

import com.example.persistence.entity.User;
import com.example.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(path = "/")
    public List<User> users() {
        return userRepository.findAll();
    }

    @RequestMapping()
    public List<User> users(@RequestParam String name,@RequestParam String lastName) {
        return userRepository.findByName(name);
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void save(@RequestBody User user) {
        userRepository.save(user);
    }


}
