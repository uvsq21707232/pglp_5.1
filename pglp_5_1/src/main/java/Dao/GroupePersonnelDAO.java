package Dao;

import java.util.ArrayList;
import Abdelhafid.pglp_5_1.Personnel.GroupePersonnel;


public class GroupePersonnelDAO implements Dao<Abdelhafid.pglp_5_1.Personnel.GroupePersonnel> {

	
	private ArrayList<GroupePersonnel> liste_personnels;
	public GroupePersonnelDAO() {
		
		this.liste_personnels= new ArrayList<GroupePersonnel>();
	}
	
	@Override
	public void ajouter(GroupePersonnel object) {
	liste_personnels.add(object);
		
	}

	@Override
	public GroupePersonnel find(int id) {
		for ( GroupePersonnel gp : liste_personnels) {
            if (gp.getId_composite() == id) {
                return gp;
            }
        }
		
		return null;
	}

	@Override
	public ArrayList<GroupePersonnel> findAll() {
	
		
		return (ArrayList<GroupePersonnel>) liste_personnels.clone();
	}

	@Override
	public GroupePersonnel update(GroupePersonnel obj) {
		
		
		return null;
	}

	@Override
	public void delete(GroupePersonnel obj) {
		
		liste_personnels.remove(obj);
	}

	

}
