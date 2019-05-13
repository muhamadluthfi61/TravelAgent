import java.util.GregorianCalendar;

import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

public class Customer {
    private int id;
    private String name;
    private GregorianCalendar birthDate;
    private String username;
    private String email;
    private String password;
    private int age;

    public Customer(int id, String name, int year, int month, int day, String username, String email, String password) {
        this.birthDate = new GregorianCalendar(year, month, day);
        GregorianCalendar today = new GregorianCalendar();
        this.age = today.get(today.YEAR) - birthDate.get(YEAR);
        int currMonth = today.get(MONTH)+1;
        int birthMonth = birthDate.get(MONTH)+1;
        int months = currMonth-birthMonth;
        if(months<0)
        {
            age--;
        }else if(months==0 && today.get(DATE)<birthDate.get(DATE)) {
            age--;
        }

        if(age<18)
        {
            throw new IllegalArgumentException("Your age must be above 18");
        }
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }


}
