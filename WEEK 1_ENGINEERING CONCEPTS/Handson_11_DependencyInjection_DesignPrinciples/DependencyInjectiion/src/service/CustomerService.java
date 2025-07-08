package service;
import model.Customer;
import repository.CustomerRepository;
public class CustomerService{
    private final CustomerRepository repository;
    public CustomerService(CustomerRepository repository){
        this.repository = repository;
    }

    public void displayCustomer(String id){
        Customer customer = repository.findCustomerByID(id);
        if (customer != null) {
            System.out.println("Customer Found: " + customer);
        } else {
            System.out.println("Customer with ID " + id + " not found.");
        }
    }
}
