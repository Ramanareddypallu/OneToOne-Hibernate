package onetooneunim8.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetooneunim8.dao.AadharCardDao;
import onetooneunim8.dao.PersonDao;
import onetooneunim8.dto.Aadharcard;
import onetooneunim8.dto.Person;

public class PersonAadharCont {

	public static void main(String[] args) {
		
		
	/*	Person person = new Person();
		person.setId(4);
		person.setName("chalama Reddy");
		person.setAddress("kadapa");
		PersonDao personDao = new PersonDao();
		personDao.savePerson(person);
		
		
		Aadharcard aadharcard = new Aadharcard();
		aadharcard.setId(104);
		aadharcard.setName("chalama Reddy");
		aadharcard.setAge(22);
		AadharCardDao aadharCardDao = new AadharCardDao();
		aadharCardDao.saveAadharcard(4, aadharcard);  
		
		
	/*	PersonDao dao = new PersonDao();
		dao.findPerson(2);
	
		AadharCardDao cardDao = new AadharCardDao();
		cardDao.findAadharcard(2);
		*/
		
	/*	Person person = new Person();
		person.setId(102);
		person.setAddress("kadiri");
		person.setName("sneha reddy");
		PersonDao dao = new PersonDao();
		dao.updatePerson(2, person);
	/*	
		Aadharcard aadharcard = new Aadharcard();
		aadharcard.setAge(25);
		aadharcard.setId(101);
		aadharcard.setName("sai praveen");
		AadharCardDao aadharCardDao = new AadharCardDao();
		aadharCardDao.updateAadharcard(1, aadharcard);
		*/
		
		
	    PersonDao personDao = new PersonDao();
		personDao.findPerson(1);
		
	/*	AadharCardDao aadharCardDao = new AadharCardDao();
		aadharCardDao.deleteAadharcard(104);
		*/
		
		
	}

}
