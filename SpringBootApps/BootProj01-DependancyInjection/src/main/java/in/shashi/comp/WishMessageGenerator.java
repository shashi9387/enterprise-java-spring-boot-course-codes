package in.shashi.comp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	@Autowired
	private LocalDateTime time;
	
	public String greetMessage(String name) {
		int hour = time.getHour();
		if (hour<12) return "Good Morning "+ name;
		else if(hour<16) return "Good AfterNoon "+ name;
		else if(hour<19) return "Good Evening "+ name;
		else return "Good Night " + name;
		
	}
	
}
