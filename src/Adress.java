public class Adress {

	private String cadde;
	private String �lce;
	private String �l;
	private String ulke;

	
	public Adress(String cadde, String ilce, String il, String ulke) {		
		this.cadde = cadde;
		�lce = ilce;
		�l = il;
		this.ulke = ulke;
	}
	
	public String getCadde() {
		return cadde;
	}
	public void setCadde(String cadde) {
		this.cadde = cadde;
	}
	public String getIlce() {
		return �lce;
	}
	public void setIlce(String ilce) {
		�lce = ilce;
	}
	public String getIl() {
		return �l;
	}
	public void setIl(String il) {
		�l = il;
	}
	public String getUlke() {
		return ulke;
	}
	public void setUlke(String ulke) {
		this.ulke = ulke;
	}
	
}
