package controller;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RestController;
import component.customer;
import service.customerService;

@RestController  
public class customerController {

	
	@Autowired
	customerService cService;
	
	@GetMapping("/customer")  
	private List<customer> getAllCustomers()   
	{  
	return cService.getAllCustomers();  
	}  
	//specific customer
	@GetMapping("/customer/{customerid}")  
	private customer getCustomer(@PathVariable("customerid") int cid)   
	{  
	return cService.getCustomerById(cid);  
	}  
	@DeleteMapping("/customer/{customerid}")  
	private void deleteCustomer(@PathVariable("customerid") int cid)   
	{  
		cService.delete(cid);  
	}  
	@PostMapping("/customer")  
	private customer saveCustomer(@RequestBody customer customer)   
	{  
	cService.saveOrUpdate(customer);  
	return customer;
	
	}
	@PutMapping("/customer")  
	private customer update(@RequestBody customer customer)   
	{  
		cService.saveOrUpdate(customer);  
	return customer;  
	}  
	
	

}
