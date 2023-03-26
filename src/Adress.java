public class Adress {

	private String cadde;
	private String ýlce;
	private String ýl;
	private String ulke;

	
	public Adress(String cadde, String ilce, String il, String ulke) {		
		this.cadde = cadde;
		ýlce = ilce;
		ýl = il;
		this.ulke = ulke;
	}
	
	public String getCadde() {
		return cadde;
	}
	public void setCadde(String cadde) {
		this.cadde = cadde;
	}
	public String getIlce() {
		return ýlce;
	}
	public void setIlce(String ilce) {
		ýlce = ilce;
	}
	public String getIl() {
		return ýl;
	}
	public void setIl(String il) {
		ýl = il;
	}
	public String getUlke() {
		return ulke;
	}
	public void setUlke(String ulke) {
		this.ulke = ulke;
	}
	
}
