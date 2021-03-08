package com.lin;

import java.util.ServiceLoader;

import com.lin.service.Service;

public class UseDemo {

	public static void main(String[] args) throws Exception {
		ServiceLoader<Service> services = ServiceLoader.load(Service.class);
		for (Service service : services) {
			service.say();
		}

	}

}
