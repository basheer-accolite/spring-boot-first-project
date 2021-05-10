package Repository;
import org.springframework.data.repository.CrudRepository;  
import component.customer;
public interface customerRepository extends CrudRepository<customer,Integer>
{

}
