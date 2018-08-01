package com.axelor.app;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;

import org.jboss.resteasy.plugins.providers.html.View;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import com.axelor.app.db.Contact;

@Singleton
@Path("/")
public class ContactbookResources {
	
	
	@Inject
	ContactbookService contactbookService;
	
	@GET
	public View displayAllContact(@Context HttpServletRequest request, @Context HttpServletResponse response) throws IOException {
		
		List<Contact> contactList = contactbookService.displayAllContact();	
		return new View("/index.jsp",contactList,"contactList");		
	} 
	
	@POST
	@Path("/createNewContact")
	public void addContact(@FormParam("name") String name, @FormParam("number") long number,@Context HttpServletRequest request,@Context HttpServletResponse response) throws IOException {	
		Contact contact = new Contact();
		contact.setName(name);
		contact.setNumber(number);
		contactbookService.createNewContact(contact);	
	    response.sendRedirect(request.getContextPath());
	}
	
	@GET
	@Path("/delete/{id}")
	public void deleteContact(@PathParam("id") int id,@Context HttpServletRequest request,@Context HttpServletResponse response) throws IOException {
		contactbookService.deleteContact(id);
		response.sendRedirect(request.getContextPath());
    }
	
	@POST
	@Path("/updateContact")
	public void updateContact(@FormParam("id") int id, @FormParam("name") String name, @FormParam("number") long number,@Context HttpServletRequest request,@Context HttpServletResponse response) throws IOException {
		
		contactbookService.updateContact(id, name, number);
		response.sendRedirect("http://localhost:8080/contactbook/");	
    }
	
	@GET
	@Path("/display/{id}")
	public View displayContact(@PathParam("id") int id) {
		Contact contact = contactbookService.displayContact(id);
		return new View("/update.jsp",contact,"contact");
	} 
	
	@POST
	@Path("/search")
	public View searchContactByName(@FormParam("name") String name){
		List<Contact> contactList = contactbookService.searchByName(name);
			return new View("/index.jsp",contactList,"contactList");
	}  
}
