package org.jaxws.soap;

import java.util.List;

import javax.jws.WebService;

import org.jaxws.model.User;

@WebService(endpointInterface = "org.jaxws.soap.SOAPI")
public class SOAPImpl implements SOAPI{

	@Override
	public List<User> getUsers() {
		return User.getUsers();
	}

	@Override
	public void addUser(User user) {
		User.getUsers().add(user);
	}


}
