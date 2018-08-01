package com.axelor.app;

import java.util.List;

import com.axelor.app.db.Contact;

public interface ContactbookService {
	
	public void createNewContact(Contact c);
	public boolean deleteContact(int id);
	public boolean updateContact(int id,String name, long number);
	public Contact displayContact(int id);
	public List<Contact> displayAllContact();
	public List<Contact> searchByName(String name);
}
