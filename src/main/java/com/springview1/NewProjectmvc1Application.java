package com.springview1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NewProjectmvc1Application {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext run = SpringApplication.run(NewProjectmvc1Application.class, args);
		    UserRepositrary bean = run.getBean(UserRepositrary.class);
		       User u = new User();
		         u.setCity("delhi");
		         u.setName("amit");
		       //  User save = bean.save(u);
		         User u1 = new User();
		         u.setCity("satna");
		         u.setName("john");
		         List<User> c= new ArrayList<>();
		          c.add(u1);
		          c.add(u);
		         
		         List<User> saveAll = bean.saveAll(c);
		         for(Object s:saveAll) {
		        	 
		        	 System.out.println(s);
		         }
	}

}
