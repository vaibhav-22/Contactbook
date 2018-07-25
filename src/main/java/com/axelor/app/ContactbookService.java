package com.axelor.app;

import java.util.List;

import con.axelor.app.db.Contact;

public interface ContactbookService {
	
	public Contact createNewContact(Contact c);
	public boolean deleteContact(int id);
	public boolean updateContact(int id,Contact contact);
	public Contact displayContact(int id);
	public List<Contact> displayAllContact();
	public List<Contact> searchByName(String name);
}
