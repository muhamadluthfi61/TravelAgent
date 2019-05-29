package travelagent;

/**
 * This is Transaction Class.
 * This class is used to deal with the transaction in invoice to finish or cancel
 * @author Cahyadi Bayu Saputro, Muhammad Luthfi Mufadel, Jihad Rafsanjani, Afhdal Kurniawan
 * @version 26/05/2019
 */
public class Transaction {

    /**
     * This method is used to finish the transaction and set te isActive into false
     * @param invoice invoice
     * @return true/false
     */
    public static boolean finishTransaction(Invoice invoice)
    {
        for (Invoice invoiceDB : DatabaseInvoice.getFlightInvoiceDatabase()){
            if (invoiceDB.getId()==invoice.getId()){
                invoice.setActive(false);
                return true;
            }
        }
        return false;
    }

    /**
     * This method is used to cancel the transaction by remove it from the database.
     * @param invoice invoice
     * @return true/false
     */
    public static boolean cancelTransaction(Invoice invoice)
    {
        for (FlightInvoice invoiceDB : DatabaseInvoice.getFlightInvoiceDatabase()){
            if (invoiceDB.getId()==invoice.getId()){
                try {
                    DatabaseInvoice.removeFlightInvoice(invoice.getId());
                }
                catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                return true;
            }
        }
        return false;
    }
}
