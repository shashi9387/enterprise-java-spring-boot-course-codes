package in.shashi.bean;

import java.util.Date;

public class WishMessageGenerator {
    private Date date;
    static{
        System.out.println("Class initialized......");
    }

   public WishMessageGenerator(Date date){
       System.out.println("Class has been Loaded....");
       this.date=date;
   }
   public String greetMessage(String name){
       System.out.println("Constructer loading successuful....");
        int hour= date.getHours();
       if (hour <= 12) {
           return "hello" + name + "Good Morning ";
       } else {
           return hour <= 19 ? "hello" + name + "Good Evening " : "hello" + name + "Good Night ";
       }
   }

}
