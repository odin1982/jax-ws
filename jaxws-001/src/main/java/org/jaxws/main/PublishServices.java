package org.jaxws.main;

import javax.xml.ws.Endpoint;

import org.jaxws.soap.SOAPImpl;

//Ir a esta url:  http://localhost:1516/WS/Users?wsdl
public class PublishServices {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1516/WS/Users", new SOAPImpl());
	}
}
