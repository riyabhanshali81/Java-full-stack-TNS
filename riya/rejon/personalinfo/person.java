package manthan.rejon.personalinfo;
import manthan.rejon.countrystatpack.*;

public class person {
	private String pname;
	private city cty;
	private country con;
	
	public person() {
		
	}
	
	public person(String pname,country con,city cty) {
		this.pname = pname;
		this.con = con;
		this.cty = cty;
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public city getCty() {
		return cty;
	}
	public void setCty(city cty) {
		this.cty = cty;
	}
	public country getCon() {
		return con;
	}
	public void setCon(country con) {
		this.con = con;
	}
	
	@Override
	public String toString() {
		return "person [pname=" + pname + ", cty=" + cty + ", con=" + con + "]";
	}
	

}
