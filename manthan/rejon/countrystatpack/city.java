package manthan.rejon.countrystatpack;

public class city {
	private String cname;
	
	public city() {
		
	}
	
	public city(String cname) {
		this.cname = cname;
	}
	
	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "city [Cname Is: " + cname + "]";
	}


}
