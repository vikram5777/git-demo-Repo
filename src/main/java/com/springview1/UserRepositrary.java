package com.springview1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepositrary extends JpaRepository<User, Integer> {

//	 public List<User> findByName(String name);
//	 public List<User>findByNameAndCity(String name,String city);
//	 public List<User>findByNameStartingWith(String prifix);
	 
	 @Query("select u FROM User u")
	 public List<User> getAll();
	 
		/*
		 * @Query(value="DELETE FROM User WHERE name IS NULL",nativeQuery=true) public
		 * List<User> deleteNull();
		 */
//	 @Query(value =" select name from User where name=:name",nativeQuery=true)
//	 public List<User> getName(@Param("name")String name);
	 @Query(value = "SELECT * FROM users WHERE name =?", nativeQuery = true)
	 List<User> findByName(String name);
}
