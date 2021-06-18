package org.jaxws.top.down;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(
		name="EmployeeServiceTopDown",
		endpointInterface = "org.jaxws.top.down.EmployeeServiceTopDown",
		targetNamespace = "http://jaxws.topdown.com")
public class EmployeeServiceTopDownImpl {
	@WebMethod
	public int countEmployees() {
		return 5;
	}

}
