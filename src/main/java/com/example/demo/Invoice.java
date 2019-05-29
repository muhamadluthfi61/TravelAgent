package travelagent;
import java.util.GregorianCalendar;

/**
 * This is Invoice Class
 * this class is used to create an invoice
 * @author Cahyadi Bayu Saputro, Muhammad Luthfi Mufadel, Jihad Rafsanjani, Afhdal Kurniawan
 * @version 26/05/2019
 */
abstract public class Invoice {
    private int id;
    private GregorianCalendar date;
    private int totalPrice;
    private boolean isActive;
    private Customer customer;

    /**
     * This is the constructor of Invoice
     * @param customer customer
     */
    public Invoice( Customer customer)
    {
        this.id=DatabaseInvoice.getLastInvoiceId()+1;
        this.date=new GregorianCalendar();
        this.customer=customer;
        this.isActive=true;
        this.totalPrice=0;
    }

    /**
     * This method is to get the id of Invoice
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * This method is used to set/update the id of invoice
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * This method is used to get the date of the invoice
     * @return date
     */
    public GregorianCalendar getDate() {
        return date;
    }

    /**
     * this method is used to set/update the date of the invoice
     * @param date date
     */
    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    /**
     * This method is used to get the total price of teh invoice
     * @return total price
     */
    public int getTotalPrice() {
        return totalPrice;
    }

    /**
     * This method is used to set/update the total price of invoice
     * @param totalPrice total price
     */
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = this.totalPrice+totalPrice;
    }

    /**
     * This method is used to get the status of the invoice
     * @return true/false
     */
    public boolean isActive() {
        return isActive;
    }

    /**
     * This method is used to set/update the status of the invoice
     * @param active
     */
    public void setActive(boolean active) {
        isActive = active;
    }

    /**
     * This method is used to get the costumer's detail
     * @return customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * This method is used to set/update customer's detail
     * @param customer customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
