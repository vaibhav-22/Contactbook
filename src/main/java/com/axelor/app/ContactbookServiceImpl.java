package com.axelor.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;

import com.axelor.app.db.Contact;

@Singleton
public class ContactbookServiceImpl implements ContactbookService{
	
	@Inject
	Provider<EntityManager> emp; 
	
	@Override
	@Transactional
	public void createNewContact(Contact c) {
		EntityManager em = emp.get();
		em.persist(c);
	}
	
	@Override
	@Transactional
	public boolean deleteContact(int id) {
		EntityManager em = emp.get();
		Contact c = em.find(Contact.class, id);
		em.remove(c);
		return true;
	}
	
	@Override
	@Transactional
	public boolean updateContact(int id, String name, long number) {
		EntityManager em = emp.get();
		Contact c = em.find(Contact.class,id);
		c.setName(name);
		c.setNumber(number);		
		return true;
	}
	
	@Override
	@Transactional
	public Contact displayContact(int id) {
		EntityManager em = emp.get();
		Contact contact = em.find(Contact.class,id);		
		return contact;
	}
	
	@Override
	@Transactional
	public List<Contact> displayAllContact() {
		EntityManager em = emp.get();
		Query query =  em.createQuery("Select c from Contact c order by c.id asc");
		List<Contact> contactList = (List<Contact>)query.getResultList();
		return contactList;
	}
	
	@Override
	@Transactional
	public List<Contact> searchByName(String name) {
		EntityManager em = emp.get();
		Query query = em.createQuery("Select c from Contact c " + "where c.name like '%"+ name +"%'");
		List<Contact> contactList = (List<Contact>)query.getResultList();
		return contactList;
	}

}
