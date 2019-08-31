package com.qm.silijion.dao;


import com.qm.silijion.javabean.User;

public interface HelloDao {
    public int insertUser(User user);

    public User queryById(int id);
}
