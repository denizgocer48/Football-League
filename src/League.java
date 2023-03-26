public class League {
	
	private Team[] teams;			
	private int teamcount;	
	private Match[] matchs;			
	private int matchcount;
	private Coach[] coachs;			
	private int coachcount;
	private Stadium[] stadiums;			
	private int stadiumcounts;
	private Referee[] referees;			
	private int refereecount;
	
	
	public League(int numberofteams,int numberofmatchs,int numberofcoach,int numberofstadiums,int numberofreferee){
	    teams = new Team[numberofteams]; 
	    teamcount = 0;
	    matchs = new Match[numberofmatchs]; 
	    matchcount = 0;	
	    coachs = new Coach[numberofcoach]; 
		coachcount = 0;
		stadiums = new Stadium[numberofstadiums];
		stadiumcounts = 0;
		referees = new Referee[numberofreferee];
	  }

	

	public void addteam(Team e){
	    teams[teamcount] = e;
	    teamcount++;
	  }
		
	public void addstadium(Stadium e){
	    stadiums[stadiumcounts] = e;
	    stadiumcounts++;
	  }
	public void addreferee(Referee e){
	    referees[refereecount] = e;
	    refereecount++;
	  }
	
	public void addmatch(Match e){
		matchs[matchcount] = e;	
		matchcount++;						
			}
	  
	public Match[] getMatchs() {
		return matchs;
	}

	public void setMatchs(Match[] matchs) {
		this.matchs = matchs;
	}

	public int getMatchcount() {
		return matchcount;
	}

	public void setMatchcount(int matchcount) {
		this.matchcount = matchcount;
	}
	public void listteams(){	
		System.out.println("Teams: ");
	        for(int i = 0; i < teamcount; i++) {	        	
	   		 for(int j = 0;j< coachcount ; j++) {
	   			 if(coachs[j].getTeam().equals(teams[i].getName())) {
	   				System.out.println("Name : " + teams[i].getName());
	   		        System.out.println("Year : " + teams[i].getYear());
	   		        System.out.println("Cups : " + teams[i].getCups());	
	   		        System.out.println("Colors : " + teams[i].getColors());
	   		        System.out.println("Coach : " + coachs[j].getName() );
	   		        System.out.println("----------------------"); 	   					   		        
	   			 }
	   		 }
	   	 }
	      }	
	public void addcoach(Coach e){
	    coachs[coachcount] = e;
	    coachcount++;
	  }
	public void listcoachs(){	   	      	    
	      for(int i = 0; i < coachcount; i++){
	        System.out.println("name : " + coachs[i].getName());
	        System.out.println("adress : " + coachs[i].getAdress().getCadde()+" "+ coachs[i].getAdress().getIlce()+" "+ coachs[i].getAdress().getIl()+" "+ coachs[i].getAdress().getUlke());
	        System.out.println("phone : " + coachs[i].getPhone().getUlkekodu()+" "+coachs[i].getPhone().getAlankodu()+" "+coachs[i].getPhone().getNumara());	
	        System.out.println("team : " + coachs[i].getTeam());
	        System.out.println("Startdate:" + coachs[i].getStartdate().getDay()+"/"+ coachs[i].getEnddate().getMonth());
	        System.out.println("salary : " + coachs[i].getSalary());	        
	        System.out.println("----------------------");        
	      }		
	}
	
	public void listreferees(){	
		System.out.println("Referees: ");
	      for(int i = 0; i < refereecount; i++){
	        System.out.println("Name : " + referees[i].getName());
	        System.out.println("Adress : " + referees[i].getAdress().getCadde()+" "+referees[i].getAdress().getIlce()+" "+referees[i].getAdress().getIl()+" "+referees[i].getAdress().getUlke());
	        System.out.println("Phone : " + referees[i].getPhone().getUlkekodu()+" "+referees[i].getPhone().getAlankodu()+" "+referees[i].getPhone().getNumara());	
	        System.out.println("Salary : " + referees[i].getSalary());	 
	        System.out.println("----------------------");
	      }
	}	
	public void listmatches(){			 
			for(int i = 0; i < matchcount; i++){
				System.out.println("Hometeam : " + matchs[i].getHometteam()+": "+ matchs[i].getGoal());
		        System.out.println("Awayteam : " + matchs[i].getAwayteam()+": "+matchs[i].getGoal2());	
		        System.out.println("----------------------");		        
		      }	      
	}	
	public void biggeststadium() {
		String biggeststadium = stadiums[0].getName();
		int biggest_stadium = stadiums[0].getCapacity();			
		for(int i = 1;i<stadiumcounts;i++) {
			if(stadiums[i].getCapacity()>biggest_stadium) {
				biggeststadium = stadiums[i].getName();
				biggest_stadium = stadiums[i].getCapacity();				
			}			
		}
		System.out.println("Biggest Stadium is:"+" "+biggeststadium);
		System.out.println("----------------------");	
	}	
	public void increasesalary() {
		for(int m=0;m<refereecount;m++) {
			referees[m].setSalary((referees[m].getSalary()*110)/100);		
		}	
	}
	public void winner() {
		int scores[] = new int[teamcount];
		String teamnames[] = new String[teamcount];		
		for(int i = 0;i<teamcount;i++) {			
			teamnames[i] = teams[i].getName();
			scores[i] = 0;
		}
		for(int i =0; i<matchcount;i++) {
			if(matchs[i].getGoal()<matchs[i].getGoal2()) {
				for(int j =0;j<teamcount;j++) {
					if(matchs[i].getAwayteam().equals(teamnames[j])) {
						scores[j] += 3;
					}
				}			
			}
			else if(matchs[i].getGoal()>matchs[i].getGoal2()) {
				for(int j =0;j<teamcount;j++) {
					if(matchs[i].getHometteam().equals(teamnames[j])) {
						scores[j] += 3;
					}
				}			
			}
			else {
				for(int j =0;j<teamcount;j++) {
					if(matchs[i].getHometteam().equals(teamnames[j])) {
						scores[j] += 1;
					}
					else if(matchs[i].getAwayteam().equals(teamnames[j])) {
						scores[j] += 1;
					}
				}	
			}		
		}
		
		for(int i = 0;i<teamcount;i++) {
			System.out.println(teamnames[i]+":"+ scores[i]);
		}
		System.out.print("Winners: ");
		int winner_team = scores[0];			
		for(int i = 1;i<teamcount;i++) {
			if(scores[i]>winner_team) {
				winner_team = scores[i];				
			}				
		}
		for(int i=0;i<teamcount;i++) {
			if(winner_team==scores[i]) {
				System.out.print(teamnames[i]+" ");
			}
		}
		System.out.println("\n");
		System.out.println("----------------------");
	}		
}