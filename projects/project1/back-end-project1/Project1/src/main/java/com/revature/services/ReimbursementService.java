package com.revature.services;

import com.revature.daos.ReimbursementDao;
import com.revature.daos.ReimbursementHibernate;

public class ReimbursementService {
	private ReimbursementDao rd = new ReimbursementHibernate();
	public List<Reimbursement> getReimbursements(){
		return rd.getReimbursements();
	}

}
