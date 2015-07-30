package com.tw.core.dao;

import com.tw.core.db.HibernateUtil;
import com.tw.core.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class UserDao {

    public List<User> getAllUsers() {

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        session.beginTransaction();

        Query query = session.createQuery("from User");
        List<User> userList = query.list();

        session.getTransaction().commit();

        return userList;
    }

}
