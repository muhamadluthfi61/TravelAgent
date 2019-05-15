import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String pattern =  "^([a-zA-Z0-9(&*_~)]+([.])?)+[a-zA-Z0-9(&*_~)]+@([a-zA-Z0-9]+[-]?[a-zA-Z0-9]+)+([.]([a-zA-Z0-9]+))+$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        if (m.find()) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Your email format is incorrect");
        }
        String pattern1 = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[a-zA-Z_0-9]{6,}$";
        Pattern p1 = Pattern.compile(pattern1);
        Matcher m1 = p1.matcher(password);
        if(m1.find()){
            this.password = password;
        }else{
            throw new IllegalArgumentException("Password minimal 6 characters with lowercase, uppercase, and number");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GregorianCalendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(GregorianCalendar birthDate) {
        this.birthDate = birthDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String pattern =  "^([a-zA-Z0-9(&*_~)]+([.])?)+[a-zA-Z0-9(&*_~)]+@([a-zA-Z0-9]+[-]?[a-zA-Z0-9]+)+([.]([a-zA-Z0-9]+))+$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        if (m.find()) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Your email format is incorrect");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String pattern1 = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[a-zA-Z_0-9]{6,}$";
        Pattern p1 = Pattern.compile(pattern1);
        Matcher m1 = p1.matcher(password);
        if(m1.find()){
            this.password = password;
        }else{
            throw new IllegalArgumentException("Password minimal 6 characters with lowercase, uppercase, and number");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
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
    }
}
