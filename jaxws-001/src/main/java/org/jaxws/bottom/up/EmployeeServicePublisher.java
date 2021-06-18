package org.jaxws.bottom.up;

import javax.xml.ws.Endpoint;

import org.jaxws.top.down.EmployeeServiceTopDownImpl;

public class EmployeeServicePublisher {
	public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/employeeservicetopdown", new EmployeeServiceTopDownImpl());

        Endpoint.publish("http://localhost:8080/employeeservice", new EmployeeServiceImpl());
    }

}
