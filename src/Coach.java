public class Coach {

	private String name;
	private Adress adress;
	private Phone phone;
	private String team;
	private Date startdate;
	private Date enddate;
	private int salary;
	private int ID;
	
	public Coach(String name, Adress adress, Phone phone, String team, Date startdate, Date enddate, int salary,int id) {
		super();
		this.name = name;
		this.adress = adress;
		this.phone = phone;
		this.team = team;
		this.startdate = startdate;
		this.enddate = enddate;
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
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}			
		
}
