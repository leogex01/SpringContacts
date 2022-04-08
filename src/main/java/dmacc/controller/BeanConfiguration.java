/**
 * @authorchrisg - Cgeralds
 * CIS175-Fall2022
 * Mar 8, 2022
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Address;
import dmacc.beans.Contact;

@Configuration
public class BeanConfiguration {
    
	// Construct a 'bean' of Contact class
	@Bean
	public Contact contact() {
		Contact bean = new Contact("Eric Carlisle"); // A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container
		bean.setName("Dr.Seuss");
		//bean.setPhone("555-555-5555");
		//bean.setRelationship("friend");
		return bean;
	}
	
	@Bean
		public Address address() {
			Address bean = new Address("123 Main Street", "Anywhere", "Confusion");
			return bean;
		
		
	}
	
	

}
