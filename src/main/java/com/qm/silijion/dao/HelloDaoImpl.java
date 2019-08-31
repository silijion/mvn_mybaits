package com.qm.silijion.dao;


import com.qm.silijion.javabean.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("helloDao")
public class HelloDaoImpl implements HelloDao {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public User queryById(int id) {
        User user = (User)sqlSessionTemplate.selectOne("user.queryById", id);
        return user;
    }

    public int insertUser(User user) {
        int insert = sqlSessionTemplate.insert("user.insertUser", user);
        return insert;
    }
}
