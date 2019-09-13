package com.doudsystems.sales;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/customers")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping()
	public @ResponseBody Iterable<Customer> GetAllCustomers() {
		return customerRepository.findAll();
	}
	@GetMapping("/{id}")
	public @ResponseBody Optional<Customer> GetCustomer(@PathVariable Integer id) {
		return customerRepository.findById(id);
	}
	@PostMapping()
	public @ResponseBody Customer InsertCustomer(@RequestBody Customer customer) {
		customerRepository.save(customer);
		return customer;
	}
	@PutMapping()
	public @ResponseBody Customer UpdateCustomer(@RequestBody Customer customer) {
		customerRepository.save(customer);
		return customer;
	}
	@DeleteMapping()
	public @ResponseBody void DeleteCustomer(@RequestBody Customer customer) {
		customerRepository.delete(customer);
		return;
	}

}
