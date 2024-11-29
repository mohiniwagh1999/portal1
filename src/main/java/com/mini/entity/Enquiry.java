package com.mini.entity;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="enquiry_tbl")
public class Enquiry {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer eid;
	private String sname;
	private Long sphno;
	private String classMode;
	private String course;
	private String status;
	private Integer price;
	@CreationTimestamp
	private Date createdDate;
	@UpdateTimestamp
	private Date updatedDate;
	
	@ManyToOne
	@JoinColumn(name="counsellerId")
	private Counseller counseller;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Long getSphno() {
		return sphno;
	}

	public void setSphno(Long sphno) {
		this.sphno = sphno;
	}

	public String getClassMode() {
		return classMode;
	}

	public void setClassMode(String classMode) {
		this.classMode = classMode;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Counseller getCounseller() {
		return counseller;
	}

	public void setCounseller(Counseller counseller) {
		this.counseller = counseller;
	}

	@Override
	public String toString() {
		return "Enquiry [eid=" + eid + ", sname=" + sname + ", sphno=" + sphno + ", classMode=" + classMode
				+ ", course=" + course + ", status=" + status + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + ", counseller=" + counseller + "]";
	}
	
	
	
	
	
	
	

}
