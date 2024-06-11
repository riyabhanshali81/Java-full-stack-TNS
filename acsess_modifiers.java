class d {
	
	public int a = 24;
	protected String name = "manthan";
	int age = 21;
	private String deg = "MCA";
	
	public void data () {
		
		System.err.println("Data Class:.....");
		System.out.println("Public BOB: "+a);
		System.out.println("Protected Name: "+name);
		System.out.println("Default Age: "+age);
		System.out.println("Private Degree: "+deg);
	}
	
}


public class acsess_modifiers {
	 
	public static void main (String[] args) {
		d D = new d();
		D.data();
		System.out.println();
		System.err.println("Main Class:.....");
		System.out.println("Public BOB: "+D.a);
		System.out.println("Protected Name: "+D.name);
		System.out.println("Defualt Age: "+D.age);
		//System.out.println("Private Degree: "+D.deg);
		
	}
	
}
