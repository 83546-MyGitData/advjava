package com.sunbeam.entities;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Enumerated(EnumType.STRING)
	@Column(length=20)
	private Category cat;
	@Column(name="product_name",length=30,unique=true)
	private String productName;
	@Column(name="product_price")
	private double price;
	@Column(name="available_quantity")
	private int quantity;
	
	
	public Product(Category cat, String productName, double price, int quantity) {
		super();
		this.cat = cat;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Category getCat() {
		return cat;
	}

	public void setCat(Category cat) {
		this.cat = cat;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
