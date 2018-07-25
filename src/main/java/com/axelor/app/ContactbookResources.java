package com.axelor.app;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import con.axelor.app.db.Contact;

@Singleton
@Path("/contact")
public class ContactbookResources {
	
	@Inject
	ContactbookService contactbookService;
	
	@POST
	@Produces({"application/json,text/xml"})
	@Consumes({"application/json,text/xml"})
	public Contact addContact(Contact c) {			
		Contact contact = contactbookService.createNewContact(c);
		return contact;
	}
	
	@DELETE
	@Path("/{id}")
	@Produces({"application/json","text/xml"})
	@Consumes({"application/json","text/xml"})
	public boolean deleteContact(@PathParam("id") int id) {
		boolean result = contactbookService.deleteContact(id);
		return result;
	}
	
	@PUT
	@Path("/{id}")
	@Produces({"application/json","text/xml"})
	@Consumes({"application/json","text/xml"})
	public boolean updateContact(@PathParam("id") String id, Contact c) {
		
		int contactId = Integer.parseInt(id); 
		boolean response = contactbookService.updateContact(contactId,c);
		return response;
	}
	
	/* @GET
	@Path("/{id}")
	@Produces({"text/xml"})
	public Contact displayContact(@PathParam("id") int id) {
		Contact contact = contactbookService.displayContact(id);
		return contact;
	} */
	
	@GET
	@Produces({"application/xml"})
	//@Consumes({"application/json","text/xml"})
	public List<Contact> displayAllContact() {
		
		List<Contact> contactList = contactbookService.displayAllContact();
				
		return contactList;
		
	}
	
/*	@POST
	@Consumes({"application/json,text/xml"})
	@Produces({"application/json","text/xml"})	
	public List<Contact> searchContactByName(String name){
		List<Contact> contactList = contactbookService.searchByName(name);
		return contactList;		
	}*/
}
