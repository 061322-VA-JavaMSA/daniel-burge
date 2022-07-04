package com.revature.models;

import java.util.Objects;

public class Offer {
	private int offerID;
	private String status;
	private int gamingID;
	private int amount;
	private int userID;
	public int getOfferID() {
		return offerID;
	}
	public void setOfferID(int offerID) {
		this.offerID = offerID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getGamingID() {
		return gamingID;
	}
	public void setGamingID(int gamingID) {
		this.gamingID = gamingID;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(amount, gamingID, offerID, status, userID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Offer other = (Offer) obj;
		return amount == other.amount && gamingID == other.gamingID && offerID == other.offerID
				&& Objects.equals(status, other.status) && userID == other.userID;
	}
	@Override
	public String toString() {
		return "Offer [offerID=" + offerID + ", status=" + status + ", gamingID=" + gamingID + ", amount=" + amount
				+ ", userID=" + userID + "]";
	}
	public static void add(Offer o) {
		// TODO Auto-generated method stub
		
	}
	

}
