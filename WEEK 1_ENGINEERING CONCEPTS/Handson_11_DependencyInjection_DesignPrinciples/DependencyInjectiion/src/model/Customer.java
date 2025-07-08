package model;

public class Customer {
    private String id;
    private String name;
    private String email;
    public Customer(String id,String name,String email){
        this.id=id;
        this.email=email;
        this.name=name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public String toString(){
        return "Customer [ID=" + id + ", Name=" + name + ", Email=" + email + "]";
    }
}
