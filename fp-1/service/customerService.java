package service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import component.customer;
import controller.customerController;
import Repository.customerRepository;
@Service
public class customerService {

	@Autowired
	customerRepository crepository;
	
	public List<customer> getAllCustomers()   
	{  
	List<customer> customer = new ArrayList<customer>();  
	crepository.findAll().forEach(c1 -> customer.add(c1));  
	return customer;  
	}  
	public customer getCustomerById(int id)   
	{  
	return crepository.findById(id).get();  
	}  
	public void saveOrUpdate(customer c)   
	{  
		crepository.save(c);  
	}  
	public void delete(int id)   
	{  
		crepository.deleteById(id);  
	}  
	public void update(customer c, int cid)   
	{  
		crepository.save(c);  
	}  
}
