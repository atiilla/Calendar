package Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Reminder {
	@Autowired
	public int id;
	public String title;
	public String body;
	
}
