package org.jaxws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.jaxws.beans.Person;

//APUNTES - @WebService: Se crea el web sercice
//APUNTES - @SOAPBinding: Se pueden crear webservices estilo RPC o document
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface PersonService {
	@WebMethod
	public boolean addPerson(Person p);
	
	@WebMethod
	public boolean deletePerson(int id);
	
	@WebMethod
	public Person getPerson(int id);
	
	@WebMethod
	public Person[] getAllPersons();
}
