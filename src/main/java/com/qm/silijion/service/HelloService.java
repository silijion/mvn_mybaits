package com.qm.silijion.service;


import com.qm.silijion.dao.HelloDao;
import com.qm.silijion.javabean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloService {

    @Autowired
    private HelloDao helloDao;

    public int insertUser(User user){
        int i = helloDao.insertUser(user);
        return i;
    }

    public User queryById(int id){
        User user = helloDao.queryById(id);
        return user;
    }

}
