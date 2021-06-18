package org.jaxws.bottom.up;

import javax.jws.WebMethod;
import javax.jws.WebService;

/*
	@WebService denotes that it is a web service interface
	@WebMethod is used to customize a web service operation
	@WebResult is used to customize name of the XML element that represents the return value
*/
@WebService
public interface EmployeeService {
	
	@WebMethod
	Employee getEmployee(int id);
	
	@WebMethod
    Employee updateEmployee(int id, String name);

    @WebMethod
    boolean deleteEmployee(int id);

    @WebMethod
    Employee addEmployee(int id, String name);
	
}
