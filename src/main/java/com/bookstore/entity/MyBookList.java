package com.bookstore.entity;

import jakarta.persistence.Entity;  
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MyBooks")
public class MyBookList {
	
	@Id
	private Integer id;
	private String name;
	private String author;
	private Double price;

}








// spring.jpa.hibernate.ddl-auto=update  #automatic create a table
