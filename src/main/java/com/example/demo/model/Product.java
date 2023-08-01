package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
	public class Product {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String name;
//		@ManyToOne
//		@JoinColumn(name = "category_id", nullable=false)
//		private Category category;
		
		 @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
		    @JoinTable(
		        name = "product_category",
		        joinColumns = @JoinColumn(name = "product_id"),
		        inverseJoinColumns = @JoinColumn(name = "category_id")
		    )
		 	@JsonIgnore
		    private Set<Category> categories = new HashSet<>();
	   
		
		private String title;
		private String author;
		private int stock;
		private int price;
		
		
		public Product() {
			
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public Set<Category> getCategories() {
			return categories;
		}


		public void setCategories(Set<Category> categories) {
			this.categories = categories;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getAuthor() {
			return author;
		}


		public void setAuthor(String author) {
			this.author = author;
		}


		public int getStock() {
			return stock;
		}


		public void setStock(int stock) {
			this.stock = stock;
		}


		public int getPrice() {
			return price;
		}


		public void setPrice(int price) {
			this.price = price;
		}


		public Product(int id, String name, Set<Category> categories, String title, String author, int stock,
				int price) {
			super();
			this.id = id;
			this.name = name;
			this.categories = categories;
			this.title = title;
			this.author = author;
			this.stock = stock;
			this.price = price;
		}
		
		
		
		

	}
	



