import java.util.GregorianCalendar;

abstract public class Invoice {
    private int id;
    private GregorianCalendar date;
    private int totalPrice;
    private boolean isActive;
    private Customer customer;

    public Invoice(int id, Customer customer)
    {
        this.id=id;
        this.date=new GregorianCalendar();
        this.customer=customer;
        this.isActive=true;
        this.totalPrice=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = this.totalPrice+totalPrice;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
