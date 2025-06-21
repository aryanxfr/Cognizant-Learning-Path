package test;
import model.Product;
import search.Searching;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Phone", "Electronics"),
                new Product(3, "Camera", "Electronics"),
                new Product(4, "Jeans", "Fashion"),
                new Product(5, "Pencil", "Stationery")
        };

        System.out.println("Linear Search:");
        Product result1 = Searching.linearSearch(products, "Camera");
        if(result1!=null){
            System.out.println(result1);
        }else{
            System.out.println("Product not found");
        }
        System.out.println("Binary Search:");
        Product result2 = Searching.binarySearch(products, "Camera");
        if(result2!=null){
            System.out.println(result2);
        }else{
            System.out.println("Product not found");
        }
    }
}
