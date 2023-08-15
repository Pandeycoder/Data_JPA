package pandey.com.repository;

import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import pandey.com.bean.UserEntities;

public interface UserMasterRepo extends CrudRepository<UserEntities,Integer> {
	
	//select * from user_master where city=:city
    public ArrayList<UserEntities> findByCity(String city);
    
    //select * from user_master where age>=25
    public ArrayList<UserEntities> findByAgeGreaterThanEqual(int age);
    
    //select * from use_master where user_gender=:gender
    public ArrayList<UserEntities> findByGender(String gender);
    
    //select * from user_master where gender='female' and where city='bihar'
    public ArrayList<UserEntities> findByGenderAndCity(String gender,String city);
    
    @Query("select email from UserEntities where city=:city")
    public ArrayList<String> getBiharEmail(String city);
    
    //select user_email from user_master where userr_city='bihar'  (SQL query)
    //select user_emial from UserEntities where user_city='bihar'  (HQL query)
    
    @Query("select email from UserEntities where city=:city")
    public ArrayList<String> getEmail(String city);
    
    @Query("from UserEntities ")
    public ArrayList<UserEntities> allUser();
    
    @Query(value="select * from user_master",nativeQuery=true)
    public ArrayList<UserEntities> getUserSql();
    
    
    
    
    
    
}
