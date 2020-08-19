package dankovic.ljetnizadatak;

public class Vozilo {

	private int sifra;
	private String naziv;
	private String boja;
	private String tablica;

	public Vozilo() {

	}

	public Vozilo(int sifra, String naziv, String boja, String tablica) {
		super();
		this.sifra = sifra;
		this.naziv = naziv;
		this.boja = boja;
		this.tablica = tablica;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public String getTablica() {
		return tablica;
	}

	public void setTablica(String tablica) {
		this.tablica = tablica;
	}

}
