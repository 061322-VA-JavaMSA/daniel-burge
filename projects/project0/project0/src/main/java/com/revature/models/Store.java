package com.revature.models;

import java.util.Objects;

public class Store {
	private int id;
	private String genre;
	private String game;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(game, genre, id, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Store other = (Store) obj;
		return Objects.equals(game, other.game) && Objects.equals(genre, other.genre) && id == other.id
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	@Override
	public String toString() {
		return "Store [id=" + id + ", genre=" + genre + ", game=" + game + ", price=" + price + "]";
	}
	
	}
	


