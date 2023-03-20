package com.example.springstore.data.entity;



import javax.persistence.*;

import java.util.Set;

@Entity
@Table(name = "sales")
public class Sales {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String customer_name;

	private double total_amount;

	@OneToMany(mappedBy = "sale", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Products> products;

	public Sales(int id, String customer_name, double total_amount, Set<Products> products) {
		super();
		this.id = id;
		this.customer_name = customer_name;
		this.total_amount = total_amount;
		this.products = products;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	public Set<Products> getProducts() {
		return products;
	}

	public void setProducts(Set<Products> products) {
		this.products = products;
	}

	public Sales() {
		super();
	}
	}

	