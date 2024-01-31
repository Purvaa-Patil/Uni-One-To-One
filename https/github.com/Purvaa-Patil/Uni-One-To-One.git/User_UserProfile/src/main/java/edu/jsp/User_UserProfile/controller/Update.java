package edu.jsp.User_UserProfile.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.User_UserProfile.Entity.UserProfile;


public class Update {

	public static void main(String[] args) {
		
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("demo");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction =manager.getTransaction();
			
			UserProfile profile = manager.find(UserProfile.class, 3);
			if(profile!=null) {
				System.out.println("before :"+profile.getPhnno());
				profile.setPhnno(887654396l);
				System.out.println("After :"+profile.getPhnno());
				
			}
			else {
				System.out.println("user profile not found");
			}
			
			transaction.begin();
			manager.persist(profile);
			transaction.commit();
			
	}

}
