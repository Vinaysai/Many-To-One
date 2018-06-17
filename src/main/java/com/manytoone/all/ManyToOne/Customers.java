package com.manytoone.all.ManyToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Customer_Details1")
public class Customers {

	@Id
	@Column(name = "custid")
	private int id;
	@Column(name = "custName", length=10)
	private String cusname;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "venid", referencedColumnName = "vid")
	private Vendor parent;

	public Customers() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCusname() {
		return cusname;
	}

	public void setCusname(String cusname) {
		this.cusname = cusname;
	}

	public Vendor getParent() {
		return parent;
	}

	public void setParent(Vendor parent) {
		this.parent = parent;
	}

}
