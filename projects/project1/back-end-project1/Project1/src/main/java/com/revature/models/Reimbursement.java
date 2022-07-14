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
	
	@Column(columnDefinition = "NUMERIC(15,2)")
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
	@JoinColumn(name="author",nullable=false, insertable=false, updatable=false)
	private User author;
	
	@ManyToOne
	@JoinColumn(name="resolver",insertable=false,updatable=true)
	private User resolver;
	
	@ManyToOne
	@JoinColumn(name="type-id")
	private ReimbType reimbType;

	
		
	}
	

}
