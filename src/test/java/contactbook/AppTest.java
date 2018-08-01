package contactbook;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.axelor.app.db.Contact;

public class AppTest {
	Client client;
	
	@Before
	public void beforeTest() {
		client = ClientBuilder.newBuilder().build();
	}
	@Ignore
	@Test
	public void insertByJson() {
		WebTarget target =	client.target("http://localhost:8080/contactbook/contact");
		Contact contact = new Contact();
		contact.setName("Vaibhav");
		contact.setNumber(8888888);
		Response response = target.request().post(Entity.entity(contact,"application/json"));
		String value = response.readEntity(String.class);
		response.close();
		System.out.println(value.toString());
	}
	@Ignore
	@Test
	public void deleteByJson() {
		WebTarget target =	client.target("http://localhost:8080/contactbook/contact/9");
		Response response = target.request().delete();
		String value = response.readEntity(String.class);
		response.close();
		System.out.println(value.toString());			
	}
	@Ignore
	@Test
	public void displayContactByJson() {
		WebTarget target =	client.target("http://localhost:8080/contactbook/contact/6");
		Response response = target.request().get();
		String value = response.readEntity(String.class);
		response.close();
		System.out.println(value.toString());			
	}
	@Ignore
	@Test
	public void displayAllContactByJson() {
		WebTarget target =	client.target("http://localhost:8080/contactbook/contact/");
		Response response = target.request().get();
		String value = response.readEntity(String.class);
		response.close();
		System.out.println(value.toString());			
	}
	@Ignore
	@Test
	public void updateContactByJson() {
		WebTarget target =	client.target("http://localhost:8080/contactbook/contact/8");
		Contact contact = new Contact();
		contact.setName("Vaibhav");
		contact.setNumber(8888888);
		Response response = target.request().put(Entity.entity(contact,"application/json"));
		String value = response.readEntity(String.class);
		response.close();
		System.out.println(value.toString());
	}
	@Ignore
	@Test
	public void insertByXml() {
		WebTarget target =	client.target("http://localhost:8080/contactbook/contact");
		Contact contact = new Contact();
		contact.setName("Vaibhav");
		contact.setNumber(8888888);
		Response response = target.request().post(Entity.entity(contact,"application/json"));
		String value = response.readEntity(String.class);
		response.close();
		System.out.println(value.toString());
	}
	@Ignore
	@Test
	public void deleteByXml() {
		WebTarget target =	client.target("http://localhost:8080/contactbook/contact/13");
		Response response = target.request().delete();
		String value = response.readEntity(String.class);
		response.close();
		System.out.println(value.toString());			
	}
	@Ignore
	@Test
	public void displayContactByXml() {
		WebTarget target =	client.target("http://localhost:8080/contactbook/contact/6");
		Response response = target.request().get();
		String value = response.readEntity(String.class);
		response.close();
		System.out.println(value.toString());			
	}
	@Ignore
	@Test
	public void displayAllContactByXml() {
		WebTarget target =	client.target("http://localhost:8080/contactbook/contact/");
		Response response = target.request().get();
		String value = response.readEntity(String.class);
		response.close();
		System.out.println(value.toString());			
	}
	@Ignore
	@Test
	public void updateContactByXml() {
		WebTarget target =	client.target("http://localhost:8080/contactbook/contact/8");
		Contact contact = new Contact();
		contact.setName("Vaibhav");
		contact.setNumber(8888888);
		Response response = target.request().put(Entity.entity(contact,"application/json"));
		String value = response.readEntity(String.class);
		response.close();
		System.out.println(value.toString());
	}
	
/*	@Test
	public void searchByJson() {
		WebTarget target =	client.target("http://localhost:8080/contactbook/contact/");
		String name = "ch";
		Response response = target.request().post(Entity.entity(name,"text/xml"));
		String value = response.readEntity(String.class);
		response.close();
		System.out.println(value.toString());
	} */
	

}
