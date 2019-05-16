import java.util.ArrayList;

public class DatabaseCustomer {
    private static ArrayList<Customer> CUSTOMER_DATABASE=new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID=0;

    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomer()
    {
        return LAST_CUSTOMER_ID;
    }

    public static boolean addCustomer(Customer customer)
    {
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customer.getName()==customerDB.getName()||customer.getEmail()==customerDB.getEmail())
            {
                throw new IllegalArgumentException("Customer already exist");
            }
        }
        CUSTOMER_DATABASE.add(customer);
        LAST_CUSTOMER_ID=customer.getId();
        return true;
    }

    public static Customer getCustomer(int id)
    {
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customerDB.getId()==id)
            {
                return customerDB;
            }
            else
                throw new IllegalArgumentException("Customer doesn't exist");
        }
        return null;
    }

    public static boolean removeCustomer (int id)
    {
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customerDB.getId()==id)
            {
                CUSTOMER_DATABASE.remove(id);
                return true;
            }
        }
        throw new IllegalArgumentException("Customer doesn't exist");
    }

    public static Customer getCustomerLogin(String email, String password)
    {
        for (Customer customerDB : CUSTOMER_DATABASE) {
            if ((customerDB.getEmail().equals(email)) && (customerDB.getPassword().equals(password))) {
                return customerDB;
            }
        }
        return null;
    }
}
