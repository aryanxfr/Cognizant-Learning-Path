package model;

public class Product{
    public int productId;
    public String productName;
    public String category;
    public Product(int productId,String productName,String category){
        this.productId=productId;
        this.productName=productName;
        this.category=category;
    }

    public String toString(){
        return "ProductId: " + productId + ", Name: " + productName + ",Category: "+ category;
    }
}
