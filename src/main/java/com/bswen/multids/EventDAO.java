package com.bswen.multids;

import java.util.List;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bswen.multids.dao.UserDao;
import com.bswen.multids.domain.People;

@Component
public class EventDAO {
	
	@Autowired
    private UserDao userDao;
	
	public void testQueryMySQL() {
        List<People> users = userDao.queryUsersMySQL();
        for(People u : users) {
        	System.out.println(u.getName());
        }
        testQueryPostgreSQL();
    }
	
	private void testQueryPostgreSQL() {
        List<People> users = userDao.queryUsersPost();
        for(People u : users) {
        	System.out.println(u.getName());
        }
    }
}