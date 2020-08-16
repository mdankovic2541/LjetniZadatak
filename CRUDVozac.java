package dankovic.ljetnizadatak;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDVozac {

	public static void create(Vozac vozac) {
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement(
					" insert into vozac " + " (ime,prezime,dob,spol,vozilo) " + " values (?,?,?,?,?) ");
			izraz.setString(1, vozac.getIme());
			izraz.setString(2, vozac.getPrezime());
			izraz.setInt(3, vozac.getDob());
			izraz.setString(4, vozac.getSpol());
			izraz.setInt(5, vozac.getVozilo());

			izraz.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static List<Vozac> read() {
		List<Vozac> vozaci = new ArrayList<>();
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement("select * from vozac order by prezime");
			ResultSet rs = izraz.executeQuery();
			while (rs.next()) {
				vozaci.add(new Vozac(rs.getInt("sifra"), rs.getString("ime"), rs.getString("prezime"), rs.getInt("dob"),
						rs.getString("spol"), rs.getInt("vozilo")));
			}
			rs.close();
			izraz.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vozaci;
	}

	public static void update(Vozac vozac) {
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement("update vozac set " + " ime=?, " + " prezime=?, "
					+ " dob=?, " + " spol=?, " + " vozilo=? " + " where sifra=? ");
			izraz.setString(1, vozac.getIme());
			izraz.setString(2, vozac.getPrezime());
			izraz.setInt(3, vozac.getDob());
			izraz.setString(4, vozac.getSpol());
			izraz.setInt(5, vozac.getVozilo());

			izraz.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void delete(int sifra) {

		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement("delete from vozac  " + " where sifra=? ");
			izraz.setInt(1, sifra);

			izraz.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Vozac getVozac(int redniBroj) {
		int rb = 0;
		for (Vozac o : read()) {
			if (++rb == redniBroj) {
				return o;
			}
		}
		return null;
	}

}
