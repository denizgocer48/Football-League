public class Match {
	private	String hometteam;
	private int goal1;
	private String awayteam;
	private int goal2;
	private int referee1ýd;
	private int referee2ýd;
	private int referee3ýd;
	private int stadiumýd;
	
	public Match(String hHometteam, int gGoal1, String aAwayteam, int gGoal2,int rReferee1ýd,int rReferee2ýd,int rReferee3ýd,int sStadiumýd) {
		hometteam = hHometteam;
		goal1 = gGoal1;
		awayteam = aAwayteam;
		goal2 = gGoal2;
		referee1ýd = rReferee1ýd;
		referee2ýd = rReferee2ýd;
		referee3ýd = rReferee3ýd;
		stadiumýd = sStadiumýd;			
	}

	public String getHometteam() {
		return hometteam;
	}

	public void setHometteam(String hHometteam) {
		hometteam = hHometteam;
	}

	public int getGoal() {
		return goal1;
	}

	public void setGoal(int gGoal1) {
		goal1 = gGoal1;
	}

	public String getAwayteam() {
		return awayteam;
	}

	public void setAwayteam(String aAwayteam) {
		awayteam = aAwayteam;
	}

	public int getGoal2() {
		return goal2;
	}

	public void setGoals(int gGoal2) {
		goal2 = gGoal2;
	}

	public int getReferee1ýd() {
		return referee1ýd;
	}

	public void setReferee1ýd(int rReferee1ýd) {
		referee1ýd = rReferee1ýd;
	}

	public int getReferee2ýd() {
		return referee2ýd;
	}

	public void setReferee2ýd(int rReferee2ýd) {
		referee2ýd = rReferee2ýd;
	}

	public int getReferee3ýd() {
		return referee3ýd;
	}

	public void setReferee3ýd(int rReferee3ýd) {
		referee3ýd = rReferee3ýd;
	}

	public int getStadiumýd() {
		return stadiumýd;
	}

	public void setStadiumýd(int sStadiumýd) {
		stadiumýd = sStadiumýd;
	}					
}
