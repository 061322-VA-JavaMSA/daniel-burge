package com.revature.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

import com.revature.models.Reimbursement;
import com.revature.util.HibernateUtil;

public class ReimbursementHibernate implements ReimbursementDao {
	



	@Override
	public Reimbursement insertReimbursement(Reimbursement r) {
		try (Session s = HibernateUtil.getSessionFactory().openSession()) {
			Transaction tx = s.beginTransaction();
			int id = (int) s.save(r);
			r.setId(id);
			tx.commit();
		} catch (ConstraintViolationException e) {
			//log it
		}
		return r;
	}

	@Override
	public List<Reimbursement> getReimbursements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reimbursement> getReimbursementsbyAuthorId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reimbursement> getReimbursementsByResolverID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reimbursement updateReimbursement(Reimbursement r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reimbursement> getReimbursementsByStatus() {
		// TODO Auto-generated method stub
		return null;
	}}
