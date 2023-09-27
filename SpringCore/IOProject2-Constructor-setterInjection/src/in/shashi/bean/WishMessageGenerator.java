package in.shashi.bean;

import java.util.Date;

//Target class-----> UserDefined
public class WishMessageGenerator {
	
	// HAS-A relationship
	
	// Dependent class ---> Predefined
    private Date date;

    static{
        System.out.println(" wmg class loading");
    }

    public WishMessageGenerator() {
        System.out.println("wmg object created");
    }
    public WishMessageGenerator(Date date) {
    	System.out.println("CONSTRUCTOR INJECTION TO INJECT DATE OBJECT :: " + date);
		this.date = date;
    }

//    public void setDate(Date date){
//        System.out.println("setter injected TO INJECT DATE OBJECT :: " + date);
//        this.date = date;
//    }
    public String getMessage(String name){
        System.out.println("getMessage method started.....");
        @SuppressWarnings("deprecation")
		int hour = date.getHours();

        if (hour<=12)
            return "hello "+ name +" Good Morning " ;
        else if (hour<=19) {
            return "hello " + name + " Good Evening ";
        }
        else
            return "hello "+ name +" Good Night ";
    }
}
