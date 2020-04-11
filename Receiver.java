
public class Receiver extends Person {
	private String disease;
	public String hospitalname;
	public Receiver(String name, String bloodtype, String location, int age,
			String contact, String disease, String hospitalname) {
		super(name, bloodtype, location, age, contact);
		this.disease = disease;
		this.hospitalname = hospitalname;
	}
	public void display(){
		System.out.println("disease: "+disease);
		System.out.println("hospitalname: "+hospitalname);
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	

}
