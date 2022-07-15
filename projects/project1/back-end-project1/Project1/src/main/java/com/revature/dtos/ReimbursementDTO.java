package com.revature.dtos;

import java.sql.Timestamp;
import java.util.Objects;

import com.revature.models.ReimbStatus;
import com.revature.models.ReimbType;
import com.revature.models.Reimbursement;
import com.revature.models.User;


public class ReimbursementDTO {
public ReimbursementDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
private int id;
	

	private double amount;
	
	
	private Timestamp submitted;
	
	
	private Timestamp resolved;
	
	
	private String description;
	

	private User author;
	
	
	private User resolver;
	

	private ReimbStatus reimbstatus;
	

	private ReimbType reimbType;
	public ReimbursementDTO(Reimbursement r) {
		if (r!= null) {
			id = r.getId();
			amount= r.getAmount();
			submitted = r.getSubmitted();
			resolved = r.getResolved();
			description= r.getDescription();
			author = r.getAuthor();
			resolver = r.getResolver();
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Timestamp getSubmitted() {
		return submitted;
	}
	public void setSubmitted(Timestamp submitted) {
		this.submitted = submitted;
	}
	public Timestamp getResolved() {
		return resolved;
	}
	public void setResolved(Timestamp resolved) {
		this.resolved = resolved;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public User getResolver() {
		return resolver;
	}
	public void setResolver(User resolver) {
		this.resolver = resolver;
	}
	public ReimbStatus getReimbstatus() {
		return reimbstatus;
	}
	public void setReimbstatus(ReimbStatus reimbstatus) {
		this.reimbstatus = reimbstatus;
	}
	public ReimbType getReimbType() {
		return reimbType;
	}
	public void setReimbType(ReimbType reimbType) {
		this.reimbType = reimbType;
	}
	@Override
	public String toString() {
		return "ReimbursementDTO [id=" + id + ", amount=" + amount + ", submitted=" + submitted + ", resolved="
				+ resolved + ", description=" + description + ", author=" + author + ", resolver=" + resolver
				+ ", reimbstatus=" + reimbstatus + ", reimbType=" + reimbType + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(amount, author, description, id, reimbType, reimbstatus, resolved, resolver, submitted);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReimbursementDTO other = (ReimbursementDTO) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(author, other.author) && Objects.equals(description, other.description)
				&& id == other.id && Objects.equals(reimbType, other.reimbType)
				&& Objects.equals(reimbstatus, other.reimbstatus) && Objects.equals(resolved, other.resolved)
				&& Objects.equals(resolver, other.resolver) && Objects.equals(submitted, other.submitted);
	}



}
