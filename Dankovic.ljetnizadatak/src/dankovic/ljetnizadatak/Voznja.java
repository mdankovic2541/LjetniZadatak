package dankovic.ljetnizadatak;

public class Voznja {

	private int sifra;
	private int vozac;
	private int broj_putnika;
	private int trajanje;
	private int cijena;
	private String odrediste;
	private String polaziste;

	public Voznja() {

	}

	public Voznja(int sifra, int vozac, int broj_putnika, int trajanje, int cijena, String odrediste,
			String polaziste) {
		super();
		this.sifra = sifra;
		this.vozac = vozac;
		this.broj_putnika = broj_putnika;
		this.trajanje = trajanje;
		this.cijena = cijena;
		this.odrediste = odrediste;
		this.polaziste = polaziste;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	public int getVozac() {
		return vozac;
	}

	public void setVozac(int vozac) {
		this.vozac = vozac;
	}

	public int getBroj_putnika() {
		return broj_putnika;
	}

	public void setBroj_putnika(int broj_putnika) {
		this.broj_putnika = broj_putnika;
	}

	public int getTrajanje() {
		return trajanje;
	}

	public void setTrajanje(int trajanje) {
		this.trajanje = trajanje;
	}

	public int getCijena() {
		return cijena;
	}

	public void setCijena(int cijena) {
		this.cijena = cijena;
	}

	public String getOdrediste() {
		return odrediste;
	}

	public void setOdrediste(String odrediste) {
		this.odrediste = odrediste;
	}

	public String getPolaziste() {
		return polaziste;
	}

	public void setPolaziste(String polaziste) {
		this.polaziste = polaziste;
	}

}
