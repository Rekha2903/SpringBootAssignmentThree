/**
 * 
 */
package com.example.assignment3.model;

import java.sql.Date;
import java.util.ArrayList;

/**
 * @author Admin
 *
 */
public class Policy {
	
	private String policyName;
	private int policyId;
	private int customerId;
	private String customerFname;
	private String customerLname;
	private String premiumFrequency;
	private long premiumAmount;
	private Date maturityDate;
	private double maturityAmount;
	private ArrayList<Policy> list;

	/**
	 * @return the list
	 */
	public ArrayList<Policy> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<Policy> list) {
		this.list = list;
	}

	/**
	 * Default Constructor
	 */
	public Policy() {
		}
	
	/**
	 * @param policyName
	 * @param policyId
	 * @param customerId
	 * @param premiumFrequency
	 * @param premiumAmount
	 * @param maturityDate
	 * @param maturityAmount
	 */
	public Policy(String policyName, int policyId, int customerId, String premiumFrequency, long premiumAmount,
			Date maturityDate, double maturityAmount, ArrayList<Policy> list) {
		this.policyName = policyName;
		this.policyId = policyId;
		this.customerId = customerId;
		this.premiumFrequency = premiumFrequency;
		this.premiumAmount = premiumAmount;
		this.maturityDate = maturityDate;
		this.maturityAmount = maturityAmount;
		this.list = list;
	}

	/**
	 * @param policyName the policyName to set
	 */
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	
	/**
	 * @return the policyName
	 */
	public String getPolicyName() {
		return policyName;
	}
	
	/**
	 * @return the policyId
	 */
	public int getPolicyId() {
		return policyId;
	}

	/**
	 * @param policyId the policyId to set
	 */
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerLname() {
		return customerLname;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerLname(String customerLname) {
		this.customerLname = customerLname;
	}
	
	/**
	 * @return the customerName
	 */
	public String getCustomerFname() {
		return customerFname;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerFname(String customerFname) {
		this.customerFname = customerFname;
	}

	/**
	 * @return the premiumFrequency
	 */
	public String getPremiumFrequency() {
		return premiumFrequency;
	}

	/**
	 * @param premiumFrequency the premiumFrequency to set
	 */
	public void setPremiumFrequency(String premiumFrequency) {
		this.premiumFrequency = premiumFrequency;
	}

	/**
	 * @return the premiumAmount
	 */
	public long getPremiumAmount() {
		return premiumAmount;
	}

	/**
	 * @param premiumAmount the premiumAmount to set
	 */
	public void setPremiumAmount(long premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	/**
	 * @return the maturityDate
	 */
	public Date getMaturityDate() {
		return maturityDate;
	}

	/**
	 * @param maturityDate the maturityDate to set
	 */
	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	/**
	 * @return the maturityAmount
	 */
	public double getMaturityAmount() {
		return maturityAmount;
	}

	/**
	 * @param maturityAmount the maturityAmount to set
	 */
	public void setMaturityAmount(double maturityAmount) {
		this.maturityAmount = maturityAmount;
	}
}
