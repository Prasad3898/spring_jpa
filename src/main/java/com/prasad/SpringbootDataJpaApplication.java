package com.prasad;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.prasad.entity.Books;
import com.prasad.repository.BookRepository;

@SpringBootApplication
public class SpringbootDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext tx = SpringApplication.run(SpringbootDataJpaApplication.class, args);
	BookRepository bean = tx.getBean(BookRepository.class);
	Books bk=new Books();
	bk.setBookid(1002233);
	bk.setBookname("java1");
	bk.setBookprice(25000.00);
	Books bk1=new Books();
	bk1.setBookid(100);
	bk1.setBookname("sql");
	bk1.setBookprice(2500.00);
	ArrayList<Books> list =new ArrayList<Books>();
	list.add(bk);
	list.add(bk1);
	
	bean.saveAll(list);
	System.out.println("Record Inserted.........");
	
	}

}
