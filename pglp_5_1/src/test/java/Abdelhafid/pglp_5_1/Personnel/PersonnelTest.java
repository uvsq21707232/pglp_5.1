package Abdelhafid.pglp_5_1.Personnel;

import static org.junit.Assert.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.junit.Before;
import org.junit.Test;
import Abdelhafid.pglp_5_1.Personnel.Telephone;
import Abdelhafid.pglp_5_1.Personnel.Personnel.PersonnelBuilder;

public class PersonnelTest {

	private Personnel personne;

	@Before()

	public void initialisation() {

		personne = new PersonnelBuilder("BELHABIB", "Soufiane", "Informaticien")
				.Naissance(LocalDate.parse("1992-06-16", DateTimeFormatter.ISO_DATE))
				.ajouter_numero(new Telephone("Perso", "0650784512")).ajouter_numero(new Telephone("Pro", "0650784513"))
				.build();
	}

	@Test()
	public void testGetNom() {
		assertEquals(personne.getNom(), "BELHABIB");
	}

	@Test()
	public void testGetPrenom() {
		assertEquals(personne.getPrenom(), "Soufiane");
	}

	@Test()
	public void testGetFonction() {
		assertEquals(personne.getFonction(), "Informaticien");
	}

	@Test()
	public void testGetDate_naissance() {
		assertEquals(personne.getDate_naissance(), LocalDate.parse("1992-06-16", DateTimeFormatter.ISO_DATE));
	}

	@Test()
	public void testGetTele() {
		personne.print();
	}


}
