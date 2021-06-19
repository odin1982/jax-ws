package org.jaxws.service;

import javax.xml.ws.Endpoint;
//XXX - Direccion para ver publicado tu web services http://localhost:8081/ws/person?wsdl  
public class SOAPPublisher {
	public static void main(String[] args) {
		 Endpoint.publish("http://localhost:8081/ws/person", new PersonServiceImpl());  
	}

}
