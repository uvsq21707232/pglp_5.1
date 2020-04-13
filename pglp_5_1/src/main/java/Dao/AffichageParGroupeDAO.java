package Dao;

import java.util.ArrayList;

import Abdelhafid.pglp_5_1.Personnel.AffichageParGroupe;

public class AffichageParGroupeDAO implements Dao<Abdelhafid.pglp_5_1.Personnel.AffichageParGroupe> {

	private ArrayList<AffichageParGroupe> affList;

	public AffichageParGroupeDAO() {

		this.affList = new ArrayList<AffichageParGroupe>();

	}

	@Override
	public void ajouter(AffichageParGroupe object) {

		affList.add(object);

	}

	@Override
	public AffichageParGroupe find(int id) {
		for (AffichageParGroupe aff : affList) {
			if (aff.getIdentification() == id) {
				return aff;
			}
		}
		return null;
	}

	@Override
	public ArrayList<AffichageParGroupe> findAll() {

		return (ArrayList<AffichageParGroupe>) affList.clone();
	}

	@Override
	public AffichageParGroupe update(AffichageParGroupe obj) {

		return null;
	}

	@Override
	public void delete(AffichageParGroupe obj) {
		affList.remove(obj);

	}

}
