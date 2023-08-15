package pandey.com.service;

import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pandey.com.bean.UserEntities;
import pandey.com.repository.UserMasterRepo;

@Service
public class UserMasterService {
	
	@Autowired
	private UserMasterRepo userMasterRepo;
	
	public void finAll()
	{
		//ArrayList<UserEntities>	entities=userMasterRepo.allUser();   // HQL
		
		ArrayList<UserEntities>	entities=userMasterRepo.getUserSql();   //  SQL

		for(UserEntities entities1:entities)
		{
			System.out.println(entities1);
		}
	}
	
	
	public void userEmail()
	{
		ArrayList<String>	entities=userMasterRepo.getEmail("bihar");

		for(String entities1:entities)
		{
			System.out.println(entities1);
		}
		
	}
	public void testCustomQueries()
	{
		ArrayList<String>	entities=userMasterRepo.getBiharEmail("bihar");
		
		for(String entities1:entities)
		{
			System.out.println(entities1);
		}
	}
	public void testFindByMethod()
	{
	//ArrayList<UserEntities>	entities=userMasterRepo.findByCity("bihar");
	
	//ArrayList<UserEntities> entities=userMasterRepo.findByAgeGreaterThanEqual(25);
	
    //ArrayList<UserEntities> entities=userMasterRepo.findByGender("female");
		
	 ArrayList<UserEntities> entities=userMasterRepo.findByGenderAndCity("female", "bihar");
	 
		
	
		
	/*entities.forEach(entity ->{
	System.out.println(entity);
		
	});*/
	
	for(UserEntities entities1:entities)
	{
		System.out.println(entities1);
	}
	
	}
	
	
	
	

}
