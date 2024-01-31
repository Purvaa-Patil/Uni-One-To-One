package edu.jsp.User_UserProfile.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.User_UserProfile.Entity.UserProfile;


public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("demo");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		
		
		UserProfile userProfile =manager.find(UserProfile.class, 5 );
		System.out.println("-----------------------------------------------------");
		if(userProfile!=null) {
			manager.remove(userProfile);
			System.out.println("user profile data removed from table");
		}
		else {
			System.out.println("user profile  not found");
		}
		
		transaction.begin();
		transaction.commit();
}
}
	


