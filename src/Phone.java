public class Phone {
	private int ulkekodu;
	private int alankodu;
	private int numara;

	public Phone(int ulkekodu, int alankodu, int numara) {
		super();
		this.ulkekodu = ulkekodu;
		this.alankodu = alankodu;
		this.numara = numara;
	}
	
	public int getUlkekodu() {
		return ulkekodu;
	}
	public void setUlkekodu(int ulkekodu) {
		this.ulkekodu = ulkekodu;
	}
	public int getAlankodu() {
		return alankodu;
	}
	public void setAlankodu(int alankodu) {
		this.alankodu = alankodu;
	}
	public int getNumara() {
		return numara;
	}
	public void setNumara(int numara) {
		this.numara = numara;
	}
}
