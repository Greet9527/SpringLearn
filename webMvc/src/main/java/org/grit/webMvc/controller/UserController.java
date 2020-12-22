package org.grit.webMvc.controller;

import org.grit.webMvc.dao.UserDao;
import org.grit.webMvc.entity.User;
import org.grit.webMvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserService UserService;

    @GetMapping("/find")
    public HttpEntity<User> findUser() throws Exception {
        return new HttpEntity<>(UserService.findUser());
    }
}
