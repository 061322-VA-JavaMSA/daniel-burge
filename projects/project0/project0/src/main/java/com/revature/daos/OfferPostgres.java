package com.revature.daos;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.connectionutil.ConnectionUse;
import com.revature.models.Offer;

public class OfferPostgres implements OfferDAO {

	@Override
	public List<Offer> retrieveOffers() {
		String sql = "select * from offers;";
		List<Offer> offer = new ArrayList();
		try(Connection c =  (ConnectionUse.getConnectionFromFile())){
			Statement s =  (Statement) c.createStatement();
			ResultSet rs = ((java.sql.Statement) s).executeQuery(sql);
			while(rs.next()) {
				Offer o = new Offer();
				o.setOfferID(rs.getInt("offer_id"));
				o.setStatus(rs.getString("status"));
				o.setGamingID(rs.getInt("gaming_id"));
				o.setAmount(rs.getInt("amount"));
				o.setUserID(rs.getInt("user_id"));
				Offer.add(o);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return offer;
			
		}
				
		
	

	@Override
	public Offer updateOffer(Offer o) {
String sql = "update offers set status = (?) where offer_id = (?);";
		
		try (Connection c = (ConnectionUse.getConnectionFromFile())){
			PreparedStatement ps = c.prepareStatement(sql);
			
			ps.setString(1, o.getStatus());
			ps.setInt(2, o.getOfferID());
			ps.executeUpdate();
//			ResultSet rs = ps.executeQuery(sql);
//
//			while(rs.next()) {
//				((Offers) ps).setStatus(rs.getString("status"));
//
//			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return o;
	}

	@Override
	public Offer makeanOffer(Offer o) {
		String sql = "insert into offers (offer_id, amount, user_id) values (?,?,?) returning offer_id, gaming_id, amount, user_id;";
		try(Connection c = (ConnectionUse.getConnectionFromFile())){
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, o.getGamingID());
			ps.setInt(2, o.getAmount());
			ps.setInt(3, o.getUserID());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				o.setOfferID(rs.getInt("offer_id"));
				o.setGamingID(rs.getInt("gaming_id"));
				o.setAmount(rs.getInt("amount"));
				o.setUserID(rs.getInt("user_id"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return o;
	}

}
