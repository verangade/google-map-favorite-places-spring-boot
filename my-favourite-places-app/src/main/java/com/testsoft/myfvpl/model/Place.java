package com.testsoft.myfvpl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@Entity
public class Place implements Serializable{
	
	

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;
	
	private String address;
	
	private double lat;
	
	private double lang;
	
	private String type;

	

	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public double getLat() {
		return lat;
	}



	public void setLat(double lat) {
		this.lat = lat;
	}



	public double getLang() {
		return lang;
	}



	public void setLang(double lang) {
		this.lang = lang;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	@Override
	public String toString() {
		return "Place [id=" + id + ", name=" + name + ", addess=" + address + ", lat=" + lat + ", lang=" + lang
				+ ", type=" + type + "]";
	}
	
	
	
	
	
}
