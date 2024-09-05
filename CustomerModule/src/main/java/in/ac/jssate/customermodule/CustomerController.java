package in.ac.jssate.customermodule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	// RetriveAll
	@GetMapping("/customers")
	public List<Customer> list(){
		return service.listAll();
	}
	
	//RetriveById
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> get(@PathVariable Integer id) {
		try {
			Customer customer = service.get(id);
			return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Create
	@PostMapping("/customers")
	public void add(@RequestBody Customer customer){
		service.save(customer);
	}
	
	//update
	@PutMapping("/customers/{id}")
	public ResponseEntity<?> update(@PathVariable Integer id,@RequestBody Customer customer){
		try{
			Customer existcustomer = service.get(id);
			existcustomer.setName(customer.getName());
	        existcustomer.setOrder_id(customer.getOrder_id());
	        existcustomer.setPhone(customer.getPhone());
	        existcustomer.setEmail(customer.getEmail());
			service.save(existcustomer);
			return new ResponseEntity<>(HttpStatus.OK);

		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	//Delete
	@DeleteMapping("/customers/{id}")
	public void delete(@PathVariable Integer id) {
			service.delete(id);
		}
}
