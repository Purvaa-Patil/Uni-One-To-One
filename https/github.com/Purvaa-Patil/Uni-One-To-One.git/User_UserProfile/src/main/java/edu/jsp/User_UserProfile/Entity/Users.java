package edu.jsp.User_UserProfile.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Users {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private int user_Id;
private String name;


public int getUser_Id() {
	return user_Id;
}
public void setUser_Id(int user_Id) {
	this.user_Id = user_Id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Users() {
	super();
}

}
