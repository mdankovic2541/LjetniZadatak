package dankovic.ljetnizadatak;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDVozilo {

	public static void create(Vozilo vozilo) {
		try {
			PreparedStatement izraz = Baza.getVeza()
					.prepareStatement(" insert into vozilo " + " (naziv,boja,tablica) " + " values (?,?,?) ");
			izraz.setString(1, vozilo.getNaziv());
			izraz.setString(2, vozilo.getBoja());
			izraz.setString(3, vozilo.getTablica());

			izraz.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static List<Vozilo> read() {
		List<Vozilo> vozila = new ArrayList<>();
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement("select * from vozac order by prezime");
			ResultSet rs = izraz.executeQuery();
			while (rs.next()) {
				vozila.add(new Vozilo(rs.getInt("sifra"), rs.getString("naziv"), rs.getString("boja"),
						rs.getString("tablica")));
			}
			rs.close();
			izraz.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vozila;
	}

	public static void update(Vozilo vozilo) {
		try {
			PreparedStatement izraz = Baza.getVeza()
					.prepareStatement("update vozilo set " + " nazic=?, " + " boja=?, " + " tablica=? ");
			izraz.setString(1, vozilo.getNaziv());
			izraz.setString(2, vozilo.getBoja());
			izraz.setString(3, vozilo.getTablica());

			izraz.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void delete(int sifra) {

		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement("delete from vozilo  " + " where sifra=? ");
			izraz.setInt(1, sifra);

			izraz.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Vozilo getVozilo(int redniBroj) {
		int rb = 0;
		for (Vozilo o : read()) {
			if (++rb == redniBroj) {
				return o;
			}
		}
		return null;
	}

}
