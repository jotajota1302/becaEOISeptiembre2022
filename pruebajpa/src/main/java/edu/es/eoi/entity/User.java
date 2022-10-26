package edu.es.eoi.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "persona", name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "username")
	private String username;

	@Column
	private String mail;

	@Column
	private String password;

	@Column
	@Temporal(TemporalType.DATE)
	private Date lastAccess;

	@OneToOne(fetch = FetchType.LAZY,mappedBy = "user", cascade = CascadeType.ALL)
	private Fingerprint fingerprint;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_address", joinColumns = @JoinColumn(name = "iduser"), inverseJoinColumns = @JoinColumn(name = "idaddress"))
	private List<Address> addresses;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
	private List<Animal> animals;

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

	public Fingerprint getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(Fingerprint fingerprint) {
		this.fingerprint = fingerprint;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", mail=" + mail + ", password=" + password
				+ ", lastAccess=" + lastAccess + "]";
	}

}
