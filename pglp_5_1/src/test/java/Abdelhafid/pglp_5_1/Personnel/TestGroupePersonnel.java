package Abdelhafid.pglp_5_1.Personnel;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class TestGroupePersonnel {
	
	@Test
	/* tester le constructeur*/
	public void constructeur() {
		GroupePersonnel grp = new GroupePersonnel();
		
		Iterator<PersonnelInterface> ip = grp.iterator();
		assertFalse(ip.hasNext());
	}
	
	@Test
	/* tester la méthode Ajouter*/
	public void testAjouter() {
		GroupePersonnel cp = new GroupePersonnel();
		cp.ajouter(new GroupePersonnel());
		Iterator<PersonnelInterface> inter_per  = cp.iterator();
		
		assertTrue(inter_per .hasNext());
	}
	
	@Test
	/* tester la méthode supprimer*/
	public void testSupprimer() {
	
		GroupePersonnel gp1 = new GroupePersonnel();
		GroupePersonnel gp2 = new GroupePersonnel();
		
		gp1.ajouter(gp2);
		gp1.supprimer(gp2);
		
		Iterator<PersonnelInterface> inter_per = gp1.iterator();
		assertFalse(inter_per .hasNext());
	}
	

}
