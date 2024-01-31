package edu.jsp.User_UserProfile.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.User_UserProfile.Entity.Users;
import edu.jsp.User_UserProfile.Entity.UserProfile;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManagerFactory factory= Persistence.createEntityManagerFactory("demo");
EntityManager manager=factory.createEntityManager();
EntityTransaction transaction=manager.getTransaction();

Users user= new Users();
user.setName("Kavya");


UserProfile userProfile = new UserProfile();
userProfile.setPhnno(123456l);
userProfile.setUser(user);


transaction.begin();
manager.persist(user);
manager.persist(userProfile);
transaction.commit();


}
	

}
