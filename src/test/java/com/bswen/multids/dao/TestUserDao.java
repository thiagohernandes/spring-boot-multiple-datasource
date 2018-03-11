package com.bswen.multids.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bswen.multids.domain.People;

/**
 * Created by xx on 2017-1-13.
 *
 * @author xx
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserDao {
    @Autowired
    private UserDao userDao;

    @Test
    public void testQueryMySQL() {
        List<People> users = userDao.queryUsersMySQL();
        for(People u : users) {
        	System.out.println(u.getName());
        }
        assertNotNull(users);
        assertTrue(users.size()>0);
    }

    @Test
    public void testQueryPost() {
    	List<People> users = userDao.queryUsersPost();
    	for(People u : users) {
        	System.out.println(u.getName());
        }
        assertNotNull(users);
        assertTrue(users.size()>0);
    }
}
