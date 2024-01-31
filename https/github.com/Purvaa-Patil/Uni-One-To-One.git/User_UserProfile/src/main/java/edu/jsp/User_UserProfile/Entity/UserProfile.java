package edu.jsp.User_UserProfile.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserProfile {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private int userProfileNo;
private long phnno;
@OneToOne
private Users user;
public Users getUser() {
	return user;
}
public void setUser(Users user) {
	this.user = user;
}
public int getUserProfileNo() {
	return userProfileNo;
}
public void setUserProfileNo(int user_Profile_No) {
	this.userProfileNo = user_Profile_No;
}
public long getPhnno() {
	return phnno;
}
public void setPhnno(long phnno) {
	this.phnno = phnno;
}
public UserProfile() {
	super();
}

}
