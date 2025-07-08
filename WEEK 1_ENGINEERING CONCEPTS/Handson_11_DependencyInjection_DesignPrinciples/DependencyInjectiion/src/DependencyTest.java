import repository.CustomerRepository;
import repository.CustomerRepositoryImpl;
import service.CustomerService;

public class DependencyTest {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        service.displayCustomer("0001");
        service.displayCustomer("0003"); // Not found
    }
}
