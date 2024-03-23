package onetooneunim8.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetooneunim8.dto.Aadharcard;
import onetooneunim8.dto.Person;

public class AadharCardDao {
	
	public void saveAadharcard(int id, Aadharcard aadharcard) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ram");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	Person dbPerson = entityManager.find(Person.class, id);
	if(dbPerson!=null) {
	EntityTransaction entityTransaction = entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(aadharcard);
	dbPerson.setAadharcard(aadharcard);
	entityTransaction.commit();
	}else {
		System.out.println("Sorry Id is not present/Person is not present");
	}
	}
	
	
	public void findAadharcard(int id) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ram");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Aadharcard dbAaadharcard = entityManager.find(Aadharcard.class, id);
		if(dbAaadharcard!=null) {
			System.out.println(dbAaadharcard);
		}else {
			System.out.println("sorry id is not present");
		}
	}
	
	
	public void updateAadharcard(int id, Aadharcard aadharcard) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ram");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Aadharcard dbAaadharcard = entityManager.find(Aadharcard.class, id);
		if(dbAaadharcard!=null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			aadharcard.setId(id);
			entityManager.merge(aadharcard);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry id is not present ");
		}
		
	}
	
	
public void deleteAadharcard(int id) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ram");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Aadharcard dbAadharcard = entityManager.find(Aadharcard.class, id);
		if(dbAadharcard!=null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbAadharcard);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry id is not present ");
		}
		
	}

}
