package in.shashi.bean;

import java.sql.SQLOutput;
import java.util.Date;

public class WishMessageGenerator {
    private Date date;

    static{
        System.out.println(" wmg class loading.......");
    }

    public WishMessageGenerator() {
        System.out.println("constructor instantiated.....");
    }

    public void setDate(Date date){
        System.out.println("setter injected.....");
        this.date = date;
    }
    public String getMessage(String name){
        System.out.println("getMessage method started.....");
        int hour = date.getHours();

        if (hour<=12)
            return "hello"+ name +"Good Morning " ;
        else if (hour<=19) {
            return "hello" + name + "Good Evening ";
        }
        else
            return "hello"+ name +"Good Night ";
    }
}
