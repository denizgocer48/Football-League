public class Stadium {

	private String name;	
	private String city;	
	private int capacity;
	private String lighting;
	private String surface;
	private int ID;
	

	public Stadium(String nName,String cCity,int cCapacity,String lLighting,String sSurface,int id) {
		name = nName;
		city = cCity;
		capacity = cCapacity;
		lighting = lLighting;
		surface = sSurface;	
		ID = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String nName) {
		name = nName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String cCity) {
		city = cCity;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int cCapacity) {
		capacity = cCapacity;
	}


	public String isLighting() {
		return lighting;
	}


	public void setLighting(String lLighting) {
		lighting = lLighting;
	}


	public String getSurface() {
		return surface;
	}


	public void setSurface(String sSurface) {
		surface = sSurface;
	}	
	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}
}
