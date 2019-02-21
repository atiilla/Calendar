package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calendar {
	
	@Autowired
	private int Id;
	private LocalDate startDate;
	private LocalDate endDate;
	private List<String> schedulars = new ArrayList<String>();
	
	
	public List<String> CalendarGet(Schedular sch) {
		schedulars.add(sch.toString());
		return schedulars;
		
	}

}
