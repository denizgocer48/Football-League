public class Company {

	private String name;
	private Adress address;
	private Phone phone;	
	private String team;
	private int ID;
	
	public Company(String nName,Adress aAddress,Phone pPhone,String tTeam,int id) {
		name=nName;
		address=aAddress;
		phone=pPhone;
		team=tTeam;			
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

	public void setName(String nName) {
		name = nName;
	}	
	public Adress getAddress() {
		return address;
	}

	public void setAddress(Adress aAddress) {
		address = aAddress;
	}
	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone pPhone) {
		phone = pPhone;
	}
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String tTeam) {
		team = tTeam;
	}
	
	
	
	
	
}
