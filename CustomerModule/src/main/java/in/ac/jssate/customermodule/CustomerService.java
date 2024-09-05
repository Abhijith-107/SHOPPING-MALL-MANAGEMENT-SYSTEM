package in.ac.jssate.customermodule;
//user defined function

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	private CustomerRepository repo;
	
	// Retrieve All
	public List<Customer> listAll(){
		return repo.findAll();
		
	}
	
	// RetriveById
	public Customer get(Integer id) {
		return repo.findById(id).get();
	}
	
	// Create
	public void save(Customer customer) {
		repo.save(customer);
	}
	
	// Delete
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
}
