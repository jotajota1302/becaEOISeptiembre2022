package edu.es.eoi;

import java.util.Date;

public class User {
	
	private int id;
	
	private String username;
	
	private String mail;
	
	private String password;
	
	private Date lastAccess;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLastAccess() {
		return lastAccess;
	}

	public void setLastAccess(Date lastAccess) {
		this.lastAccess = lastAccess;
	}
	

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", mail=" + mail + ", password=" + password
				+ ", lastAccess=" + lastAccess + "]";
	}
	
	

}
