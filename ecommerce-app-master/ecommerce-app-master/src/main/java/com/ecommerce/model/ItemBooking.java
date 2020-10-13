package com.ecommerce.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class ItemBooking {

	@Id
	@GeneratedValue(generator = "booking-id-gen")
	@GenericGenerator(name = "booking-id-gen", parameters = @Parameter(name = "prefix", value = "FB"), strategy = "com.dxbair.services.flightbooking.domain.util.StringSequenceIdGenerator")
	private String id;

	@ManyToOne
	private Customer passenger;

	@ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinTable(name = "booking_Items", joinColumns = @JoinColumn(name = "booking_id"), inverseJoinColumns = @JoinColumn(name = "flight_id"))
	private Set<Item> Items;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Customer getPassenger() {
		return passenger;
	}

	public void setCustomer(Customer passenger) {
		this.passenger = passenger;
	}

	public Set<Item> getFlights() {
		return Items;
	}

	public void setItems(Set<Item> flights) {
		this.Items = Items;
	}

	@Override
	public String toString() {
		return "ItemBooking [id=" + id + ", passenger=" + passenger + "]";
	}

}
