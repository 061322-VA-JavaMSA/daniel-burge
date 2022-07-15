package com.revature.models;

import java.sql.Timestamp;
import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;



@Entity
@Table(name="reimbursements")


public class Reimbursement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column(columnDefinition = "NUMERIC(19,2)")
	private double amount;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Timestamp submitted;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Timestamp resolved;
	
	@Column
	private String description;
	
	@ManyToOne
	@JoinColumn(name="author_id",nullable=false, insertable=false, updatable=false)
	private User author;
	
	@ManyToOne
	@JoinColumn(name="resolver_id",insertable=false,updatable=true)
	private User resolver;
	
	@ManyToOne
	@JoinColumn
	(name="status_id")
	private ReimbStatus reimbstatus;
	
	@ManyToOne
	@JoinColumn(name="type_id")
	private ReimbType reimbType;



	

	
	public Reimbursement(){
		super();
		id = -1;
		
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
	public ReimbType getReimbtype() {
		return reimbType;
	}
	public void setReimbtype(ReimbType reimbtype) {
		this.reimbType = reimbtype;
	}
	@Override
	public int hashCode() {
		return Objects.hash(amount, author, description, id, reimbType, resolved, resolver, submitted);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reimbursement other = (Reimbursement) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(author, other.author) && Objects.equals(description, other.description)
				&& id == other.id && Objects.equals(reimbType, other.reimbType)
				&& Objects.equals(resolved, other.resolved) && Objects.equals(resolver, other.resolver)
				&& Objects.equals(submitted, other.submitted);
	}
	@Override
	public String toString() {
		return "Reimbursement [id=" + id + ", amount=" + amount + ", submitted=" + submitted + ", resolved=" + resolved
				+ ", description=" + description + ", author=" + author + ", resolver=" + resolver + ", reimbType="
				+ reimbType + "]";
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
}
