public class Appointment {
	private Person visitor;
	private String reason;
	private boolean open;
	private Time start;
	private Time end;
	
	public Appointment(Time start, Time end) {
		this.visitor = new Person();
		this.open = true;
		System.out.println(start.getHour() +": " + start.getMinute());
		this.start = start;
		System.out.println(this.start.getHour() + ": " + this.start.getMinute());
		this.end = end;
	}
	
	public Person getVisitor() { return visitor; }
	public void setVisitor(Person visitor) { this.visitor = visitor; }
	public String getReason() { return this.reason; }
	public void setReason(String reason) { this.reason = reason; }

	@Override
	public String toString() {
		return this.start + " - " + this.end + " " + ((this.open) ? "OPEN" : "CLOSED");
	}
}
