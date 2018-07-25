package com.axelor.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;

import con.axelor.app.db.Contact;

@Singleton
public class ContactbookServiceImpl implements ContactbookService{
	
	@Inject
	Provider<EntityManager> emp; 
	
	@Override
	@Transactional
	public Contact createNewContact(Contact c) {
		EntityManager em = emp.get();
		em.persist(c);
		return c;
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
	public boolean updateContact(int id, Contact contact) {
		EntityManager em = emp.get();
		Contact c = em.find(Contact.class,id);
		c.setName(contact.getName());
		c.setNumber(contact.getNumber());		
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
		Query query =  em.createQuery("Select c from Contact c");
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
