package manthan.rejon.personalinfo;
import manthan.rejon.countrystatpack.*;


public class dempPerson {
	public static void main(String[] args) {
		
		country con = new country("india");
		city cty = new city("ah");
		person p = new person("manthan",con,cty);
		
		System.out.println(p);
		
	}
}
