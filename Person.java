
public  class Person {
	public String Name,Bloodtype,Location;
	private int Age;
	private String Contact;
	
	public Person(String name, String bloodtype, String location, int age,
			String contact) {
		super();
		Name = name;
		Bloodtype = bloodtype;
		Location = location;
		Age = age;
		Contact = contact;
	}


	public  void display(){
		
		System.out.println("Name: "+Name);
		System.out.println("Bloodtype: "+Bloodtype);
		System.out.println("Location: "+Location);
		System.out.println("Age: "+Age);
		System.out.println("Contact: "+Contact);
		
		
		
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public String getContact() {
		return Contact;
	}


	public void setContact(String contact) {
		Contact = contact;
	}
	

}
