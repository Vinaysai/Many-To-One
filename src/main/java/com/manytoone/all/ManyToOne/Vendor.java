package com.manytoone.all.ManyToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vendor1")
public class Vendor {
	@Id
	@Column(name = "vid")
	private int vid;
	@Column(name = "vname", length = 10)
	private String vname;

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public Vendor() {
		super();
	}

}
