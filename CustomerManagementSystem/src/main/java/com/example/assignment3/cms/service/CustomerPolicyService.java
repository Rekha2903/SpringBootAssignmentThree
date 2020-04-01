/**
 * 
 */
package com.example.assignment3.cms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignment3.cms.model.PolicyDetail;
import com.example.assignment3.cms.repo.CustomerMgmtSystemRepo;

/**
 * @author Admin
 *
 */
@Service
public class CustomerPolicyService {
	@Autowired
	CustomerMgmtSystemRepo repo;

	public CustomerPolicyService() {
		super();
		}

	public ArrayList<PolicyDetail> getAllPolicyDetails(int customerId) {
		List<PolicyDetail> policyList = new ArrayList<PolicyDetail>();
		repo.findAll().forEach(policyList::add);
		return (ArrayList<PolicyDetail>) policyList.stream().filter(policy->policy.getCustomerId()==customerId).collect(Collectors.toList());	}
}


