package me.pixka.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Version;

import org.springframework.data.annotation.LastModifiedDate;

@MappedSuperclass
public class Data implements Datainterface {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	@Column(nullable = true)
	protected Integer addby = 0;
	//@CreationTimestamp
	protected Date adddate;
	@LastModifiedDate
	protected Date lastedit;
	@Version
	protected Integer vers=0;

	@PrePersist
	public void add() {
		adddate = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAddby() {
		return addby;
	}

	public void setAddby(Integer addby) {
		this.addby = addby;
	}

	public Date getAdddate() {
		return adddate;
	}

	public void setAdddate(Date adddate) {
		this.adddate = adddate;
	}

	public Date getLastedit() {
		return lastedit;
	}

	public void setLastedit(Date lastedit) {
		this.lastedit = lastedit;
	}

	public Integer getVers() {
		return vers;
	}

	public void setVers(Integer vers) {
		this.vers = vers;
	}

	@PreUpdate
	public void update() {
		lastedit = new Date();
	}

}
