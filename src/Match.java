public class Match {
	private	String hometteam;
	private int goal1;
	private String awayteam;
	private int goal2;
	private int referee1�d;
	private int referee2�d;
	private int referee3�d;
	private int stadium�d;
	
	public Match(String hHometteam, int gGoal1, String aAwayteam, int gGoal2,int rReferee1�d,int rReferee2�d,int rReferee3�d,int sStadium�d) {
		hometteam = hHometteam;
		goal1 = gGoal1;
		awayteam = aAwayteam;
		goal2 = gGoal2;
		referee1�d = rReferee1�d;
		referee2�d = rReferee2�d;
		referee3�d = rReferee3�d;
		stadium�d = sStadium�d;			
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

	public int getReferee1�d() {
		return referee1�d;
	}

	public void setReferee1�d(int rReferee1�d) {
		referee1�d = rReferee1�d;
	}

	public int getReferee2�d() {
		return referee2�d;
	}

	public void setReferee2�d(int rReferee2�d) {
		referee2�d = rReferee2�d;
	}

	public int getReferee3�d() {
		return referee3�d;
	}

	public void setReferee3�d(int rReferee3�d) {
		referee3�d = rReferee3�d;
	}

	public int getStadium�d() {
		return stadium�d;
	}

	public void setStadium�d(int sStadium�d) {
		stadium�d = sStadium�d;
	}					
}
