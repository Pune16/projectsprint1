package com.light.bill.entity;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Id;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;


@Entity
public class Consumer{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@NotBlank(message = "Invalid Name: Empty name")
	@Column(name="consumer_name")
	private String name;
	
	@Column(name="password")
    private String password;
	
	@Column(name="address")
    private String address;
	
	@Column(name="email")
	private String email;
	
	
	public Consumer() {}
	public Consumer(int id, String name, String password, String address, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.address = address;
		this.email = email;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Consumer [Id=" + id + ", name=" + name + ", password=" + password + ", address=" + address + ", email="
				+ email + "]";
	}
	
}
