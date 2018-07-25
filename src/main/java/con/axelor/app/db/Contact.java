package con.axelor.app.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="Contact")
@Entity
public class Contact {
		
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private long number;
	
	public Contact() {
			
		}
		
	public Contact(String name, long number) {
		this.name = name;
		this.number = number;
	}
	@XmlAttribute	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}	
	
	@Override 
	public String toString() {
		String s = "ID : " + this.getId() + "  Name : " + this.getName() + "  Number : "
				    + this.getNumber();
		return s;
	}
}
