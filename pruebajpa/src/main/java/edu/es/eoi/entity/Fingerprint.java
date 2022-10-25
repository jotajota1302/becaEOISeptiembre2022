package edu.es.eoi.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "persona", name = "fingerprint")
public class Fingerprint {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date scandate;
	
	@Column
	private String finger;
	
	@Column
	private String image;
	
	@OneToOne(cascade = CascadeType.ALL)	
	@JoinColumn(name = "iduser", referencedColumnName = "id")
	private User user;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getScandate() {
		return scandate;
	}

	public void setScandate(Date scandate) {
		this.scandate = scandate;
	}

	public String getFinger() {
		return finger;
	}

	public void setFinger(String finger) {
		this.finger = finger;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Fingerprint [id=" + id + ", scandate=" + scandate + ", finger=" + finger + ", image=" + image + "]";
	}

	
}
