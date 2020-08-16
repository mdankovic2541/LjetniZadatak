package dankovic.ljetnizadatak;

public class Vozac {

	private int sifra;
	private String ime;
	private String prezime;
	private int dob;
	private String spol;
	private int vozilo;

	public Vozac() {

	}

	public Vozac(int sifra, String ime, String prezime, int dob, String spol, int vozilo) {
		super();
		this.sifra = sifra;
		this.ime = ime;
		this.prezime = prezime;
		this.dob = dob;
		this.spol = spol;
		this.vozilo = vozilo;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public String getSpol() {
		return spol;
	}

	public void setSpol(String spol) {
		this.spol = spol;
	}

	public int getVozilo() {
		return vozilo;
	}

	public void setVozilo(int vozilo) {
		this.vozilo = vozilo;
	}

}
