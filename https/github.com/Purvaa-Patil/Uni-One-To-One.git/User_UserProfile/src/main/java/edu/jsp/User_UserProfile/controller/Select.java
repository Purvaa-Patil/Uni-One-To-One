package edu.jsp.User_UserProfile.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.User_UserProfile.Entity.UserProfile;


public class Select {
public static void main(String[] args) {
		
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("demo");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction =manager.getTransaction();
			
			UserProfile profile = manager.find(UserProfile.class, 2);
			
			System.out.println("------------------------------------------");
			
			
			if(profile!=null) {
				
				System.out.println("User ID : "+profile.getUserProfileNo());
				
				
				if(profile.getUser()!=null) {
					System.out.println("User NAME: "+profile.getUser().getName());

				}
				else {
					System.out.println("User not found ");
					}
			}
			else {
				System.out.println("Profile not found");
			}
			
			transaction.begin();
			manager.persist(profile);
			transaction.commit();
			
	}

}
