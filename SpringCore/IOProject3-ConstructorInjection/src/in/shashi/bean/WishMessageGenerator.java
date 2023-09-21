package in.shashi.bean;

import java.util.Date;

public class WishMessageGenerator {
    private Date date;

    static{
        System.out.println(" wmg class loading.......");
    }

    public WishMessageGenerator(Date date) {
        System.out.println("CONSTRUCTOR INJECTION IS HAPPENING TO INJECT DATE OBJECT :: " + date);
        this.date = date;
    }


    public String getMessage(String name){
        System.out.println("getMessage method started.....");
        @SuppressWarnings("deprecation")
        int hour = date.getHours();

        if (hour<=12)
            return "hello"+ name +"Good Morning " ;
        else if (hour <= 16)
            return "Hello :: " + name + " Good Afternoon!!!";
        else if (hour<=19) {
            return "hello" + name + "Good Evening ";
        }
        else
            return "hello"+ name +"Good Night ";
    }
}
