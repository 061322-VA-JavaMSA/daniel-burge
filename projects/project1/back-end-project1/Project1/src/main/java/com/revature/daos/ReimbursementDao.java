package com.revature.daos;


import java.util.List;

import com.revature.models.ReimbStatus;
import com.revature.models.Reimbursement;

public interface ReimbursementDao {
	Reimbursement insertReimbursement(Reimbursement r);
	
	List<Reimbursement> getReimbursements();
	List<Reimbursement> getReimbursementsbyAuthorId(int id);
	List<Reimbursement> getReimbursementsByResolverID(int id);
	Reimbursement updateReimbursement(Reimbursement r);
	List<Reimbursement> getReimbursementsByStatus(ReimbStatus status);

}
