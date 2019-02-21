package Model;

import org.springframework.stereotype.Component;

@Component
public class Event extends Schedular{

	private String title;

	private String start;

	private String end;
	private String startMoment;
	private String endMoment;
	
	
	public Event(String title,String startMoment, String endMoment) {
		this.title = title;
		this.startMoment = startMoment;
		this.endMoment = endMoment;
	}
	
	
	
	@Override
	public String toString() {
		return "Event [title=" + title + ", startMoment=" + startMoment + ", endMoment=" + endMoment + "]";
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}
	
	
	
}