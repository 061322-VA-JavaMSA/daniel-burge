package com.revature.services;

import java.util.List;

import com.revature.daos.ReimbursementDao;
import com.revature.daos.ReimbursementHibernate;
import com.revature.models.Reimbursement;

public class ReimbursementService {
	private ReimbursementDao rb = new ReimbursementHibernate();
	public List<Reimbursement> getReimbursements(){
		return rb.getReimbursements();
	}
	public List<Reimbursement>getReimbursementbyAuthorId(){
		return rb.getReimbursements();
	}
}
