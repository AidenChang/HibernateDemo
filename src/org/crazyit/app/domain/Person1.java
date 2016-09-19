package org.crazyit.app.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="person1_inf")
public class Person1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="person_id")
	private Integer id;
	private int age;
	private String name;
	@ElementCollection(targetClass=String.class)
	@CollectionTable(name="school_inf", joinColumns=@JoinColumn(name="person_id",nullable=false))
	@Column(name="school_name")
	@OrderColumn(name="array_order")
	private String[] schools;
	
	public String[] getSchools() {
		return schools;
	}
	public void setSchools(String[] schools) {
		this.schools = schools;
	}
	//	@Lob
//	private byte[] pic;
	public Integer getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public byte[] getPic() {
//		return pic;
//	}
//	public void setPic(byte[] pic) {
//		this.pic = pic;
//	}
}
