package org.jaxws.bottom.up.client;

import java.net.URL;

public class EmployeeServiceClient {
	 public static void main(String[] args) throws Exception {
	        URL url = new URL("http://localhost:8080/employeeservice?wsdl");

	        EmployeeServiceImplService employeeService_Service = new EmployeeServiceImplService(url);
	        EmployeeService employeeServiceProxy = employeeService_Service.getEmployeeServiceImplPort();

	        Employee employee = employeeServiceProxy.getEmployee(1);
	        System.out.println("employee: " + employee.firstName);
	    }
}
