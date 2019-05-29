package travelagent.controller;

import travelagent.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class InvoiceController {
    @RequestMapping("/invoicecustomer/{id_customer}")
    public ArrayList<FlightInvoice> invoiceCust(@PathVariable int id_customer) {
        ArrayList<FlightInvoice> invoice = null;
        try {
            invoice = DatabaseInvoice.getActiveFlightInvoice(DatabaseCustomer.getCustomer(id_customer));
            return invoice;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @RequestMapping(value = "/hotelinvoicecustomer/{id_customer}")
    public ArrayList<HotelInvoice> hotelInvoiceCust(@PathVariable int id_customer){
        ArrayList<HotelInvoice> invoice = null;
        try {
            invoice = DatabaseInvoice.getActiveHotelInvoice(DatabaseCustomer.getCustomer(id_customer));
            return invoice;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @RequestMapping("/invoice/{id_invoice}")
    public Invoice getInvoice(@PathVariable int id_invoice) {
        Invoice invoice= DatabaseInvoice.getFlightInvoice(id_invoice);
        return invoice;
    }

    @RequestMapping("/hotelinvoices/{id_invoice}")
    public Invoice getHotelInvoice(@PathVariable int id_invoice){
        Invoice invoice = DatabaseInvoice.getHotelInvoice(id_invoice);
        return invoice;
    }

    @RequestMapping(value = "/createflightinvoice",method = RequestMethod.POST)
    public FlightInvoice createFlightInvoice(@RequestParam (value = "id") int id_customer){
        try {
            boolean res = DatabaseInvoice.addFlightInvoice(new FlightInvoice(DatabaseCustomer.getCustomer(id_customer)));
            if (res == true){
                return DatabaseInvoice.getFlightInvoice(DatabaseInvoice.getLastInvoiceId());
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @RequestMapping(value = "/createhotelinvoice",method = RequestMethod.POST)
    public HotelInvoice createHotelInvoice(@RequestParam (value = "id") int id_customer){
        try {
            boolean res = DatabaseInvoice.addHotelInvoice(new HotelInvoice(DatabaseCustomer.getCustomer(id_customer)));
            if (res == true){
                return DatabaseInvoice.getHotelInvoice(DatabaseInvoice.getLastInvoiceId());
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @RequestMapping(value = "/canceltransaction",method = RequestMethod.POST)
    public FlightInvoice cancelTransaction(@RequestParam(value = "id") int id_invoice ){
        FlightInvoice tempinv = DatabaseInvoice.getFlightInvoice(id_invoice);
        boolean res = Transaction.cancelTransaction(tempinv);
        if (res == true){
            System.out.println("Invoice ini Telah Dibatalkan");
            return tempinv;
        }
        return null;
    }

    @RequestMapping(value = "/finishtransaction", method = RequestMethod.POST)
    public FlightInvoice finishTransaction(@RequestParam(value = "id") int id_invoice ){
        FlightInvoice tempinv = DatabaseInvoice.getFlightInvoice(id_invoice);
        boolean res = Transaction.finishTransaction(tempinv);
        if (res == true){
            System.out.println("Invoice ini Telah Diselesaikan");
            return tempinv;
        }
        return null;
    }
}
