
package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;

@RestController
public class SpringJava4sController {

	@GetMapping(path="/get-cust-info")
	public Customer customerInformation() 
	{
		Customer cust = new Customer();
		
		cust.setCustNo(100);
		cust.setName(" Bank of America ");
		cust.setCountry(" United States");
		
		return cust;
	}
}

// URL: http://localhost:8080/springbootrestxml/get-cust-info
// URL: http://localhost:8080/springbootrestxml/get-cust-info.json