/**
 * 
 */
package com.todo.item;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author sabiya
 *
 */
@Entity()
@Table(name="item")
public class Item {

	 @Id
	 @GeneratedValue
	 @Column(name = "id")
	 private int id;
	 
	String name;
	@Column(name = "createdDate", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	Date createdDate;
	Date dueDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
