package repository;
import java.util.HashMap;
import java.util.Map;
import model.Customer;
public class CustomerRepositoryImpl implements CustomerRepository{
    private Map<String, Customer> database=new HashMap<>();
    public CustomerRepositoryImpl() {
        // Simulate database
        database.put("0001", new Customer("0001", "John", "jon@example.com"));
        database.put("0002", new Customer("0002", "bush", "bush@example.com"));
    }

    @Override
    public Customer findCustomerByID(String id) {
        return database.get(id);
    }
}
