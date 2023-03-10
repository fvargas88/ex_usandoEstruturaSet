package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {
	private String usarname;
	private Date moment;
	public LogEntry(String usarname, Date moment) {
		
		this.usarname = usarname;
		this.moment = moment;
	}
	public String getUsarname() {
		return usarname;
	}
	public void setUsarname(String usarname) {
		this.usarname = usarname;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	@Override
	public int hashCode() {
		return Objects.hash(usarname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(usarname, other.usarname);
	}
	
	
	

}
