package day46Static;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	/*
	 * create a class Customer
encapsulated:
    -> String name
    -> String email  
-> getters and setters
-> 2 constructors:
    -> no-args
        name = "undefined"
        email = "undefined"
    -> 2 args
-> toString
	 
	 */
	
	private String name;
    private String email;
    
    static int count; //shared by everyone/all objects.
                      //one central copy of this variable
    public Customer() {
        name = "undefined";
        this.email = "undefined";
        count++;
    }
    
    public Customer(String name, String email) {
        this.name = name;
        setEmail(email);
        count++;
    }
    public String toString() {
        return "Customer [name=" + name + ", email=" + email + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        //conditions
        this.email = email;
    }
}