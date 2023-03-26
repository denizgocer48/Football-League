public class Player {
	private String licensenumber;
	private String name;
	private String nationality;
	private Adress adress;
	private Phone phone;
	private String team;
	private Date startdate;
	private Date enddate;
	private int salary ;
	private String positionalrole;
	private Date birthdate;	
	private int ID;
	
	public Player(String licensenumber, String name, Date birthdate ,String nationality, Adress adress, Phone phone, String team,
			Date startdate, Date enddate, int salary, String positionalrole,int id) {		
		this.licensenumber = licensenumber;
		this.name = name;
		this.nationality = nationality;
		this.adress = adress;
		this.phone = phone;
		this.team = team;
		this.startdate = startdate;
		this.enddate = enddate;
		this.salary = salary;
		this.positionalrole = positionalrole;
		this.birthdate = birthdate;
		ID = id;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getLicensenumber() {
		return licensenumber;
	}
	public void setLicensenumber(String licensenumber) {
		this.licensenumber = licensenumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
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
	public String getPositionalrole() {
		return positionalrole;
	}
	public void setPositionalrole(String positionalrole) {
		this.positionalrole = positionalrole;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	
	
	

	
				
}
