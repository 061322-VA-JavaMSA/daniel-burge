package com.revature.daos;


import java.util.List;


import com.revature.models.Reimbursement;

public interface ReimbursementDao {
	Reimbursement insertReimbursement(Reimbursement r);
	
	List<Reimbursement> getReimbursements();
	List<Reimbursement> getReimbursementsbyAuthorId();
	List<Reimbursement> getReimbursementsByResolverID();
	Reimbursement updateReimbursement(Reimbursement r);
	List<Reimbursement> getReimbursementsByStatus();

}
