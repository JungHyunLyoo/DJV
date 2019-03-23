package com.example.demo;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.Member;

@RestController
public class TestController {
	@RequestMapping("/")
	public String index() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
		
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction tx=em.getTransaction();
		
		try {
			tx.begin();
			
			String id="id";
			Member member=new Member();
			member.setId(id);
			member.setName("name");
			member.setAge(28);
			em.persist(member);
			
			Member memberTest=em.find(Member.class, "id");
			System.out.println(member.getName());
			
			tx.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return "main page";
	}
}
