public class Team {

	private String name;
	private int year;
	private int cups;
	private String colors;
	private Player[] players;			
	private int playercount;	
	private Company[] companies;			
	private int companycount;
	private int ID;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Team(String nName,int yYear, int cCups,String cColors,int numberofplayers,int numberofcompany,int id) {
		name = nName;
		year=yYear;
		cups=cCups;
		colors = cColors;	
		players = new Player[numberofplayers]; 
		playercount = 0;		
		companies = new Company[numberofcompany]; 
		companycount = 0;	
		ID = id;
	}
	public int getCups() {
		return cups;
	}
	public void setCups(int cCups) {
		 cups = cCups;
	}
	public String getName() {
		return name;
	}
	public void setName(String nName) {
		name = nName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int yYear) {
		year = yYear;
	}
	public String getColors() {
		return colors;
	}
	public void setColors(String cColors) {
		colors = cColors;
	}	
	public void addplayer(Player e){
	    players[playercount] = e;
	    playercount++;
	  }
	public void listplayers(){	
		System.out.println("Players: ");
	      for(int i = 0; i < playercount; i++){
	    	if (players[i] != null) {
	    		System.out.println("licensenumber : " + players[i].getLicensenumber());
		        System.out.println("name : " + players[i].getName());
		        System.out.println("birthdate : " + players[i].getBirthdate().getDay()+"/"+players[i].getBirthdate().getMonth()+"/"+players[i].getBirthdate().getYear()+"/");	
		        System.out.println("adress : " + players[i].getAdress().getCadde()+" "+ players[i].getAdress().getIlce()+" "+ players[i].getAdress().getIl()+" "+ players[i].getAdress().getUlke()+" ");	
		        System.out.println("phone : " + players[i].getPhone().getUlkekodu()+" "+players[i].getPhone().getAlankodu()+" "+players[i].getPhone().getNumara() );
		        System.out.println("team : " + players[i].getTeam());
		        System.out.println("startdate : " + players[i].getStartdate().getDay()+"/"+players[i].getStartdate().getMonth()+"/"+players[i].getStartdate().getYear());
		        System.out.println("enddate : " + players[i].getEnddate().getDay()+"/"+players[i].getEnddate().getMonth()+"/"+players[i].getEnddate().getYear());
		        System.out.println("salary : " + players[i].getSalary());
		        System.out.println("positionalrole : " + players[i].getPositionalrole());
		        System.out.println("----------------------"); 
	    	}	               
	      }
	}
	public void deletePlayer(int m) {
		for (int i = 0; i < playercount; i++) {
            if(Integer.valueOf(players[i].getLicensenumber()) == m){
                players[i]=null;               
            }
        }
    }			
	public void addcompany(Company e){
		companies[companycount] = e;
		companycount++;
	  }	
	public void listcompanies(){	
		System.out.println("Companies: ");
	      for(int i = 0; i < companycount; i++){
	        System.out.println("Name : " + companies[i].getName());
	        System.out.println("Adress : " + companies[i].getAddress().getCadde()+" "+companies[i].getAddress().getIlce()+" "+companies[i].getAddress().getIl()+" "+companies[i].getAddress().getUlke());
	        System.out.println("Phone : " + companies[i].getPhone().getUlkekodu()+" "+companies[i].getPhone().getAlankodu()+" "+companies[i].getPhone().getNumara());	
	        System.out.println("Team : " + companies[i].getTeam());	 
	        System.out.println("----------------------");
	      }
	}
}
