package in.ac.jssate.customermodule;

import org.springframework.data.jpa.repository.JpaRepository;
//JPA (Java Persistence API)
//when an interface gets properties from another interface it uses extends
public interface CustomerRepository extends JpaRepository<Customer,Integer>{
	
	//C - save();
	//R ALL - findAll();
	//R BY ID - findById() and get()
	//U - R BY ID + C
	//D - deleteById();
	

}
