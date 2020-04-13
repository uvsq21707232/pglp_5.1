package Dao;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.junit.Test;

import Abdelhafid.pglp_5_1.Personnel.Personnel;
import Abdelhafid.pglp_5_1.Personnel.Telephone;
import Abdelhafid.pglp_5_1.Personnel.Personnel.PersonnelBuilder;

public class PersonnelDaoTest {

	
	@Test()
	
	public void testAjout() {
		
		PersonnelDAO personnes=  new PersonnelDAO();
		
		Personnel	personne = new PersonnelBuilder("BELHABIB", "Riyad", "Informaticien")
				.Naissance(LocalDate.parse("1992-06-16", DateTimeFormatter.ISO_DATE))
				.ajouter_numero(new Telephone("Perso", "0650784512")).ajouter_numero(new Telephone("Pro", "0650784513"))
				.build();
		personnes.ajouter(personne);
		
		 assertEquals(personnes.find(personne.getId()), personne);
		
	}
	

	
@Test
public void testFindAll() {
	
	PersonnelDAO personnes=  new PersonnelDAO();
	
	Personnel	personne1 = new PersonnelBuilder("BELHABIB", "Riyad", "Informaticien")
			.Naissance(LocalDate.parse("1992-06-16", DateTimeFormatter.ISO_DATE))
			.ajouter_numero(new Telephone("Perso", "0650784512")).ajouter_numero(new Telephone("Pro", "0650784513"))
			.build();
	
	Personnel	personne2 = new PersonnelBuilder("BELHABIB", "Abdelhafid", "Informaticien")
			.Naissance(LocalDate.parse("1996-08-16", DateTimeFormatter.ISO_DATE))
			.ajouter_numero(new Telephone("Perso", "0789585471")).ajouter_numero(new Telephone("Pro", "0658781548"))
			.build();
	
	personnes.ajouter(personne1);
	personnes.ajouter(personne2);
	
	ArrayList<Personnel> list = personnes.findAll();
	
	ArrayList<Personnel> comparaison_list  = new ArrayList<Personnel>();
	comparaison_list.add(personne1);
	comparaison_list.add(personne2);
	
	assertEquals(list ,comparaison_list);
	
}
	
@Test
public void testDelete() {
	
	PersonnelDAO personnes=  new PersonnelDAO();
	
	Personnel	personne = new PersonnelBuilder("BELHABIB", "Riyad", "Informaticien")
			.Naissance(LocalDate.parse("1992-06-16", DateTimeFormatter.ISO_DATE))
			.ajouter_numero(new Telephone("Perso", "0650784512")).ajouter_numero(new Telephone("Pro", "0650784513"))
			.build();
	personnes.ajouter(personne);
	personnes.delete(personne);
	
	assertEquals(personnes.find(personne.getId()), null);
	
		
}

@Test
public void testUpdate() {}


}
