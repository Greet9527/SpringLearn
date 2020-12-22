package org.grit.webMvc.service;

import org.grit.webMvc.dao.UserDao;
import org.grit.webMvc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User findUser() throws Exception {
        return userDao.find();
    }
}
