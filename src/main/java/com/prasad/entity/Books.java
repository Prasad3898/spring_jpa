package com.prasad.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Books {
    @Id
	private Integer bookid;
	private String bookname;
	private Double bookprice;
	
}
