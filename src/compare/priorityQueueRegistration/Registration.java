package compare.priorityQueueRegistration;

class Registration implements Comparable<Object> {
	private int regno; // Registration number
	private String cname; // Name of the Course
	private String sname; // Name of the student
	private String sid; // Student id

	// Create a constructor to initialize the values
	Registration(int regno, String cname, String sname, String sid) {
		this.regno = regno;
		this.cname = cname;
		this.sname = sname;
		this.sid = sid;
	}

	@Override
	public int compareTo(Object obj) {
		Registration AObj = (Registration) obj;
		return this.regno - AObj.regno;

	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "Registration [regno=" + regno + ", cname=" + cname + ", sname=" + sname + ", sid=" + sid + "]";
	}

}
