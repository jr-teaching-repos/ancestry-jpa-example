package com.example.ancestrytest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    private UserRepo userDao;

    @GetMapping("/ancestry/{id}")
    @ResponseBody
    public User getAncestry(@PathVariable long id) {
        Optional<User> user = userDao.findById(id);
        return user.orElse(null);
    }

    @GetMapping("/ancestry/page/{id}")
    public String showAncestryPage(Model model) {
        return "ancestry";
    }

}
