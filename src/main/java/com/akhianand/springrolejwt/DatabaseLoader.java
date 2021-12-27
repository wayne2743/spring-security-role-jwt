package com.akhianand.springrolejwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.akhianand.springrolejwt.dao.RoleDao;
import com.akhianand.springrolejwt.model.Role;




@Component
public class DatabaseLoader implements CommandLineRunner{
	
	@Autowired
	RoleDao roleDao;

	@Override
	public void run(String... args) throws Exception {		
		roleDao.save(new Role(4 , "ADMIN", "Admin role"));
		roleDao.save(new Role(5 , "USER", "User role"));
		
	}

}
