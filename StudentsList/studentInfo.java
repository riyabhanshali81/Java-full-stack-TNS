package StudentsList;

public class studentInfo {
	
	private int RollNo;
	private String Sname;
	private String City;
	
	//Default Constructor
	public studentInfo() {
		this.Sname = "Unknown";
		this.RollNo = 0;
		this.City = "unknown";
	}
	
	//Peramiter Constructor
	public studentInfo(int RollNo,String Sname,String City) {
		this.RollNo = RollNo;
		this.Sname = Sname;
		this.City = City;
 	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "studentInfo: RollNo: " + RollNo + " , Name: " + Sname + " , City: " + City;
	}
	
}
