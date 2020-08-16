package dankovic.ljetnizadatak;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDVoznja {

	public static void create(Voznja voznja) {
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement(" insert into voznja "
					+ " (vozac,broj_putnika,trajanje,cijena,odrediste,polaziste) " + " values (?,?,?,?,?,?) ");
			izraz.setInt(1, voznja.getVozac());
			izraz.setInt(2, voznja.getBroj_putnika());
			izraz.setInt(3, voznja.getTrajanje());
			izraz.setInt(4, voznja.getCijena());
			izraz.setString(5, voznja.getOdrediste());
			izraz.setString(6, voznja.getPolaziste());
			izraz.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static List<Voznja> read() {
		List<Voznja> voznje = new ArrayList<>();
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement("select * from vozac order by prezime");
			ResultSet rs = izraz.executeQuery();
			while (rs.next()) {
				voznje.add(new Voznja(rs.getInt("sifra"), rs.getInt("vozac"), rs.getInt("broj_putnika"),
						rs.getInt("trajanje"), rs.getInt("cijena"), rs.getString("odrediste"),
						rs.getString("polaziste")));
			}
			rs.close();
			izraz.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return voznje;
	}

	public static void update(Voznja voznja) {
		try {
			PreparedStatement izraz = Baza.getVeza()
					.prepareStatement("update voznja set " + " vozac=?, " + " broj_putnika=?, " + " trajanje=?, "
							+ " cijena=?, " + " odrediste=?, " + " polaziste=? " + " where sifra=? ");
			izraz.setInt(1, voznja.getVozac());
			izraz.setInt(2, voznja.getBroj_putnika());
			izraz.setInt(3, voznja.getTrajanje());
			izraz.setInt(4, voznja.getCijena());
			izraz.setString(5, voznja.getOdrediste());
			izraz.setString(6, voznja.getPolaziste());

			izraz.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void delete(int sifra) {

		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement("delete from voznja  " + " where sifra=? ");
			izraz.setInt(1, sifra);

			izraz.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Voznja getVoznja(int redniBroj) {
		int rb = 0;
		for (Voznja o : read()) {
			if (++rb == redniBroj) {
				return o;
			}
		}
		return null;
	}

}
