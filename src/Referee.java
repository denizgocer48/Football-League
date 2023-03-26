public class Referee {

	private String name;
	private Adress adress;
	private Phone phone;
	private int salary;
	private int ID;
	public Referee(String name, Adress adress, Phone phone, int salary,int id) {
		super();
		this.name = name;
		this.adress = adress;
		this.phone = phone;
		this.salary = salary;
		ID = id;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
