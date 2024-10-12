package com.qyg;

import com.qyg.entity.User;
import com.qyg.utils.HibernateUtil;
import com.qyg.utils.SQLInterceptor;
import org.hibernate.Session;

import java.util.List;

public class test {
    public static void main(String[] args) {
        String hql = "from User where id = 1";
        try {
            Session session = HibernateUtil.currentSession();
            List<User> fromUser = session.createQuery(hql).list();
            for (User user : fromUser) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(SQLInterceptor.getExecuteSql());
    }
}