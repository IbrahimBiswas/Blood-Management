
public class Donar extends Person {
	private int pretime;
	public String predate;
	private String availabledate;
	
	public Donar(String name, String bloodtype, String location, int age,
			String contact, int pretime, String predate, String availabledate) {
		super(name, bloodtype, location, age, contact);
		this.pretime = pretime;
		this.predate = predate;
		this.availabledate = availabledate;
	}
	public int getPretime() {
		return pretime;
	}
	public void setPretime(int pretime) {
		this.pretime = pretime;
	}
	public String getPredate() {
		return predate;
	}
	public void setPredate(String predate) {
		this.predate = predate;
	}
	public String getAvailabledate() {
		return availabledate;
	}
	public void setAvailabledate(String availabledate) {
		this.availabledate = availabledate;
	}
	@Override
	public void display(){
		super.display();
		System.out.println("pretime: "+pretime);
		System.out.println("predate: "+predate);
		System.out.println("availabledate: "+availabledate);
		
		
		
		
	}
	

}
