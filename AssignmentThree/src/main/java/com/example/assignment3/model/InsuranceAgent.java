/**
 * 
 */
package com.example.assignment3.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Admin
 *
 */
@Entity
@Table
public class InsuranceAgent {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int agentId;
	private String fname;
	private String lname;
	private Date dateOfBirth;
	private boolean updateReqdOnProducts;
	
	/**
	 * @param agentId
	 * @param fname
	 * @param lname
	 * @param dateOfBirth
	 * @param updateReqdOnProducts
	 */
	public InsuranceAgent(int agentId, String fname, String lname, Date dateOfBirth, boolean updateReqdOnProducts) {
		super();
		this.agentId = agentId;
		this.fname = fname;
		this.lname = lname;
		this.dateOfBirth = dateOfBirth;
		this.updateReqdOnProducts = updateReqdOnProducts;
	}
	/**
	 * 
	 */
	public InsuranceAgent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the agentId
	 */
	public int getAgentId() {
		return agentId;
	}
	/**
	 * @param agentId the agentId to set
	 */
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @return the updateReqdOnProducts
	 */
	public boolean isUpdateReqdOnProducts() {
		return updateReqdOnProducts;
	}
	/**
	 * @param updateReqdOnProducts the updateReqdOnProducts to set
	 */
	public void setUpdateReqdOnProducts(boolean updateReqdOnProducts) {
		this.updateReqdOnProducts = updateReqdOnProducts;
	}
	
	@Override
	public String toString() {
		return "InsuranceAgent [agentId=" + agentId + ", fname=" + fname + ", lname=" + lname + ", dateOfBirth="
				+ dateOfBirth + ", updateReqdOnProducts=" + updateReqdOnProducts + "]";
	}

}
