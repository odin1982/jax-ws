package org.jaxws.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class SOAPPublisherClient {
	public static void main(String[] args) throws MalformedURLException {
		URL wsdlURL = new URL("http://localhost:8081/ws/person?wsdl");
		//create Qname using targetNamespace and name,in the wsdl you can find the values of this parameters
		QName qname = new QName("http://service.jaxws.org/", "PersonServiceImplService");
		Service service = Service.create(wsdlURL, qname);
		PersonService ps = service.getPort(PersonService.class);
		
		Person p1 = new Person(); p1.setName("Pankaj"); p1.setId(1); p1.setAge(30);
		Person p2 = new Person(); p2.setName("Meghna"); p2.setId(2); p2.setAge(25);
		
		//add person
		System.out.println("Add Person Status="+ps.addPerson(p1));
		System.out.println("Add Person Status="+ps.addPerson(p2));
		
		//get person
		System.out.println(ps.getPerson(1));
		
		//get all persons
		ps.getAllPersons().getItem().stream().forEach(s->System.out.println(s));
				
		//delete person
		System.out.println("Delete Person Status="+ps.deletePerson(2));
		
		//get all persons
		ps.getAllPersons().getItem().stream().forEach(s->System.out.println(s));
		
	}
}
