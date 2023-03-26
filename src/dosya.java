import java.io.*;
public class dosya {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("odev.txt");							
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                   new FileInputStream(f), "UTF8"));
            int i = 0;
            String str ="";
            while (br.readLine()!=null) {
            	i++;
            }         
            br.close();
            File z = new File("odev.txt");
            BufferedReader as = new BufferedReader(new InputStreamReader(
                    new FileInputStream(z), "UTF8"));
            
            for(int k =0; k<i;k++) {
            	str += as.readLine();
            	str += "\n";
            }                                   
            str = str.replace("\n",";");            
            String[] splitt = str.split(";");
            int stadiumýd = 1;
            int teamýd = 1;
            int refereeýd = 1;
            int playerýd = 1;
            int companyýd = 1;
            int coachýd = 1;
            
            Team team = new Team("",30,30 ,"",630,30,teamýd );            
            League league1 = new League(30,30,30,60,30);
            Stadium stadium = new Stadium(str, str, i, str, str,stadiumýd);                     
            for(int y =0;y<splitt.length;y++) {
            	if(splitt[y].startsWith("AddTeam")) {
            		team  = new Team(splitt[y+1],Integer.valueOf(splitt[y+2]), Integer.valueOf(splitt[y+3]),splitt[y+4],30,30,teamýd);
            		league1.addteam(team);
            		teamýd++;
            	}  
            	if(splitt[y].startsWith("AddCoach")) {            		
            		Phone k = new Phone(Integer.valueOf(splitt[y+6]),Integer.valueOf(splitt[y+7]),Integer.valueOf(splitt[y+8]));
            		Adress x = new Adress(splitt[y+2],splitt[y+3],splitt[y+4],splitt[y+5]);
            		Date v = new Date(splitt[y+10],splitt[y+11],splitt[y+12]);
            		Date vv = new Date(splitt[y+13],splitt[y+14],splitt[y+15]);
            		if(Integer.valueOf(vv.getYear())>Integer.valueOf(v.getYear())) {
            			Coach b = new Coach(splitt[y+1],x,k,splitt[y+9],v,vv,Integer.valueOf(splitt[y+16]),coachýd);           		
                		league1.addcoach(b);
                		coachýd++;            			
            		}
            		else if(vv.getYear().equals(vv.getYear())) {
            			if(Integer.valueOf(vv.getMonth())>Integer.valueOf(v.getMonth())) {
            				Coach b = new Coach(splitt[y+1],x,k,splitt[y+9],v,vv,Integer.valueOf(splitt[y+16]),coachýd);           		
                    		league1.addcoach(b);
                    		coachýd++;
                    		System.out.println(Integer.valueOf(vv.getMonth()+12));
            			}
            			else if(vv.getMonth().equals(vv.getMonth())) {
            				if(Integer.valueOf(vv.getDay())>Integer.valueOf(v.getDay())) {
                				Coach b = new Coach(splitt[y+1],x,k,splitt[y+9],v,vv,Integer.valueOf(splitt[y+16]),coachýd);           		
                        		league1.addcoach(b);
                        		coachýd++;                       		
            				}
            				else {
            					System.out.println("The expiry date of the "+splitt[y+1]+"'s contract cannot be less than the start date");
            					}
            				}
            			else {
            				System.out.println("The expiry date of the "+splitt[y+1]+"'s contract cannot be less than the start date");
            			}
            		}
            		else {
            			System.out.println("The expiry date of the "+splitt[y+1]+"'s contract cannot be less than the start date");
            		}            		
            	} 
            	if(splitt[y].startsWith("AddPlayer")) {
            		Phone q = new Phone(Integer.valueOf(splitt[y+11]),Integer.valueOf(splitt[y+12]),Integer.valueOf(splitt[y+13]));
            		Date d = new Date(splitt[y+3],splitt[y+4],splitt[y+5]);   
            		Date dd = new Date(splitt[y+15],splitt[y+16],splitt[y+17]);
            		Date ddd = new Date(splitt[y+18],splitt[y+19],splitt[y+20]);
            		Adress c = new Adress(splitt[y+7],splitt[y+8],splitt[y+9],splitt[y+10]);
            		if(Integer.valueOf(ddd.getYear())>Integer.valueOf(dd.getYear())) {
            			Player o = new Player(splitt[y+1],splitt[y+2],d,splitt[y+6],c,q,splitt[y+14],dd,ddd,Integer.valueOf(splitt[y+21]),splitt[y+22],playerýd);  
                		team.addplayer(o);
                		playerýd++;            			
            		}
            		else if(ddd.getYear().equals(dd.getYear())) {
            			if(Integer.valueOf(ddd.getMonth()+12)>Integer.valueOf(dd.getMonth()+12)) {
            				Player o = new Player(splitt[y+1],splitt[y+2],d,splitt[y+6],c,q,splitt[y+14],dd,ddd,Integer.valueOf(splitt[y+21]),splitt[y+22],playerýd);  
                    		team.addplayer(o);
                    		playerýd++;
            			}
            			else if(ddd.getMonth().equals(dd.getMonth())) {
            				if(Integer.valueOf(ddd.getDay()+10)>Integer.valueOf(dd.getDay()+10)) {
            					Player o = new Player(splitt[y+1],splitt[y+2],d,splitt[y+6],c,q,splitt[y+14],dd,ddd,Integer.valueOf(splitt[y+21]),splitt[y+22],playerýd);  
                        		team.addplayer(o);
                        		playerýd++;
            				}
            				else {
            					System.out.println("The expiry date of the "+splitt[y+2]+"'s contract cannot be less than the start date");
            					}
            				}
            			else {
            				System.out.println("The expiry date of the "+splitt[y+2]+"'s contract cannot be less than the start date");
            			}
            		}
            		else {
            			System.out.println("The expiry date of the "+splitt[y+2]+"'s contract cannot be less than the start date");
            		}            	
            	}  
            	if(splitt[y].startsWith("AddCompany")) {
            		Adress l = new Adress(splitt[y+2],splitt[y+3],splitt[y+4],splitt[y+5]);
            		Phone p = new Phone(Integer.valueOf(splitt[y+6]),Integer.valueOf(splitt[y+7]),Integer.valueOf(splitt[y+8]));
            		Company m = new Company(splitt[y+1], l, p ,splitt[y+9],companyýd);
            		team.addcompany(m);
            		companyýd++;
            	}
            	if(splitt[y].startsWith("AddStadium")) {
            		Stadium j = new Stadium(splitt[y+1],splitt[y+2],Integer.valueOf(splitt[y+3]),splitt[y+4],splitt[y+5],stadiumýd);
            		league1.addstadium(j);   
            		stadiumýd++;
            	}
            	if(splitt[y].startsWith("AddReferee")) {
            		Adress l = new Adress(splitt[y+2],splitt[y+3],splitt[y+4],splitt[y+5]);
            		Phone p = new Phone(Integer.valueOf(splitt[y+6]),Integer.valueOf(splitt[y+7]),Integer.valueOf(splitt[y+8]));
            		Referee r = new Referee(splitt[y+1], l, p ,Integer.valueOf(splitt[y+9]),refereeýd);
            		league1.addreferee(r);
            		refereeýd++;
            	}            	
            	if(splitt[y].startsWith("AddMatch")) {
            		if(Integer.valueOf(splitt[y+2])>=0 && Integer.valueOf(splitt[y+4])>=0) {
            			Match m = new Match(splitt[y+1],Integer.valueOf(splitt[y+2]),splitt[y+3],Integer.valueOf(splitt[y+4]),Integer.valueOf(splitt[y+5]),Integer.valueOf(splitt[y+6]),Integer.valueOf(splitt[y+7]),Integer.valueOf(splitt[y+8]));
                		league1.addmatch(m);
            		}
            		else {
    					System.out.println(splitt[y+1]+" and "+splitt[y+3]+" match scores cannot be negative.");
    				}            		
            	}
            	if(splitt[y].startsWith("DeletePlayer")) {
            		team.deletePlayer(Integer.valueOf(splitt[y+1]));
            	}
            }           
            league1.listteams();          
            team.listplayers();
            team.listcompanies();
            league1.increasesalary();
            league1.listreferees();
            league1.winner();  
            league1.biggeststadium();
            as.close();                                
        }
        catch(Exception e) {
            e.printStackTrace();
        }			
	}
} 