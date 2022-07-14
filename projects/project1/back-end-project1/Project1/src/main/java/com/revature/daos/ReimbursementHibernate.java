package com.revature.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

import com.revature.models.ReimbStatus;
import com.revature.models.Reimbursement;
import com.revature.models.User;
import com.revature.util.HibernateUtil;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

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
		List<Reimbursement> ri = null;

		try (Session s = HibernateUtil.getSessionFactory().openSession();) {
			ri = s.createQuery("from Reimbursement", Reimbursement.class).list();
		}

		return ri;
	}

	@Override
	public List<Reimbursement> getReimbursementsbyAuthorId(int id) {
		List<Reimbursement> r= null;

		try (Session s = HibernateUtil.getSessionFactory().openSession();) {
			CriteriaBuilder cb = s.getCriteriaBuilder();
			CriteriaQuery<Reimbursement> cq = cb.createQuery(Reimbursement.class);
			Root<Reimbursement> root = cq.from(Reimbursement.class);
			
			Predicate pFromUser = cb.equal(root.get("author"), id);
			cq.select(root).where(pFromUser);
			
			r= s.createQuery(cq).list();
		}

		return r;
	}

	@Override
	public List<Reimbursement> getReimbursementsByResolverID(int id) {
		List<Reimbursement> r= null;

		try (Session s = HibernateUtil.getSessionFactory().openSession();) {
			CriteriaBuilder cb = s.getCriteriaBuilder();
			CriteriaQuery<Reimbursement> cq = cb.createQuery(Reimbursement.class);
			Root<Reimbursement> root = cq.from(Reimbursement.class);
			
			Predicate pFromUser = cb.equal(root.get("resolver"), id);
			cq.select(root).where(pFromUser);
			
			r= s.createQuery(cq).list();
		}

		return r;
	}

	@Override
	public Reimbursement updateReimbursement(Reimbursement r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reimbursement> getReimbursementsByStatus(ReimbStatus status) {
		List<Reimbursement> r= null;
		try (Session s = HibernateUtil.getSessionFactory().openSession();) {
		CriteriaBuilder cb = s.getCriteriaBuilder();
		CriteriaQuery<Reimbursement> cq = cb.createQuery(Reimbursement.class);
		Root<Reimbursement> root = cq.from(Reimbursement.class);
		
		Predicate pFromUser = cb.equal(root.get("status"), status);
		cq.select(root).where(pFromUser);
		
		r= s.createQuery(cq).list();
	}

	return r;

	}}
