package Dao;

import java.util.ArrayList;

import Abdelhafid.pglp_5_1.Personnel.Personnel;

public class PersonnelDAO implements Dao<Abdelhafid.pglp_5_1.Personnel.Personnel> {

	private ArrayList<Personnel> liste_personnels;

	public PersonnelDAO() {
		this.liste_personnels = new ArrayList<Personnel>();
	}

	@Override

	public void ajouter(Personnel obj) {

		liste_personnels.add(obj);
	}

	@Override
	public Personnel find(int id) {
		for (Personnel personne : liste_personnels) {
			if (personne.getId() == id) {
				return personne;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Personnel> findAll() {

		return (ArrayList<Personnel>) liste_personnels.clone();

	}

	@Override
	public Personnel update(Personnel obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Personnel obj) {
		// TODO Auto-generated method stub
		liste_personnels.remove(obj);
	}

}
