package com.bswen.multids;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: bswen
 * Date: 15-7-26
 * Time: 下午10:40
 * To change this template use File | Settings | File Templates.
 */
@SpringBootApplication
public class MyApp {
    public static void main(String[] args) throws InterruptedException {
    	ConfigurableApplicationContext ctx = SpringApplication.run(MyApp.class, args);
    	EventDAO bean = ctx.getBean(EventDAO.class);
    	bean.testQueryMySQL();
	}
}
