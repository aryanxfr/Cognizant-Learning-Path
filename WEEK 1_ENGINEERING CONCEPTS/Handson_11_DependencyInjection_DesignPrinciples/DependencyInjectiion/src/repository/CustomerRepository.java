package repository;
import model.Customer;
public interface CustomerRepository{
    Customer findCustomerByID(String id);
}
