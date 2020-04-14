package Dao;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.junit.Test;

import Abdelhafid.pglp_5_1.Personnel.GroupePersonnel;
import Abdelhafid.pglp_5_1.Personnel.Personnel;
import Abdelhafid.pglp_5_1.Personnel.Telephone;
import Abdelhafid.pglp_5_1.Personnel.Personnel.PersonnelBuilder;

public class GroupePersonnelDaoTest {
	
@Test
	
	public void testAjout() {
		
		GroupePersonnelDAO groupe=   new GroupePersonnelDAO();
		GroupePersonnel gp =  new GroupePersonnel();
		Personnel	personne = new PersonnelBuilder("BELHABIB", "Riyad", "Informaticien")
				.Naissance(LocalDate.parse("1992-06-16", DateTimeFormatter.ISO_DATE))
				.ajouter_numero(new Telephone("Perso", "0650784512")).ajouter_numero(new Telephone("Pro", "0650784513"))
				.build();
		gp.ajouter(personne);
		 groupe.ajouter(gp);
		
		 assertEquals( groupe.find(gp.getId_composite()), gp);
		
	}

public void testDelete() {
	
	GroupePersonnelDAO groupe=   new GroupePersonnelDAO();
	GroupePersonnel gp =  new GroupePersonnel();
	Personnel	personne = new PersonnelBuilder("BELHABIB", "Riyad", "Informaticien")
			.Naissance(LocalDate.parse("1992-06-16", DateTimeFormatter.ISO_DATE))
			.ajouter_numero(new Telephone("Perso", "0650784512")).ajouter_numero(new Telephone("Pro", "0650784513"))
			.build();
	gp.ajouter(personne);
	 groupe.ajouter(gp);
	 groupe.delete(gp);
	
	 assertEquals( groupe.find(gp.getId_composite()), null);
	
}

@Test
public void testFindAll() {
	
	GroupePersonnelDAO groupe=   new GroupePersonnelDAO();
	
	GroupePersonnel gp1 =  new GroupePersonnel();
	GroupePersonnel gp2 =  new GroupePersonnel();
	
	Personnel	personne1 = new PersonnelBuilder("BELHABIB", "Riyad", "Informaticien")
			.Naissance(LocalDate.parse("1992-06-16", DateTimeFormatter.ISO_DATE))
			.ajouter_numero(new Telephone("Perso", "0650784512")).ajouter_numero(new Telephone("Pro", "0650784513"))
			.build();
	
	Personnel	personne2 = new PersonnelBuilder("BELHABIB", "Abdelhafid", "Informaticien")
			.Naissance(LocalDate.parse("1996-08-16", DateTimeFormatter.ISO_DATE))
			.ajouter_numero(new Telephone("Perso", "0789585471")).ajouter_numero(new Telephone("Pro", "0658781548"))
			.build();
	
     gp1.ajouter(personne1);
	 gp2.ajouter(personne2);
	 
	 groupe.ajouter(gp1);
	 groupe.ajouter(gp2);
	 
	
	ArrayList<GroupePersonnel> list = groupe.findAll();
	
	ArrayList<GroupePersonnel> comparaison_list  = new ArrayList<GroupePersonnel>();
	comparaison_list.add(gp1);
	comparaison_list.add(gp2);
	
	assertEquals(list ,comparaison_list);
}

@Test
public void testUpdate() {}



}
