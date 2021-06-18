package org.jaxws.bottom.up;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "org.jaxws.bottom.up.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @WebMethod
    public Employee getEmployee(int id) {
        return new Employee();
    }

    @WebMethod
    public Employee updateEmployee(int id, String name) {
        return new Employee(id,name);
    }

    @WebMethod
    public boolean deleteEmployee(int id) {
        System.out.println("Deleting employee");
    	return true;
    }

    @WebMethod
    public Employee addEmployee(int id, String name) {
        return new Employee(id,name);
    }

}
