package Dao;

import java.util.ArrayList;

import Abdelhafid.pglp_5_1.Personnel.Personnel;
import Abdelhafid.pglp_5_1.Personnel.Telephone;

public class TelephoneDAO implements Dao<Abdelhafid.pglp_5_1.Personnel.Telephone> {

	private ArrayList<Telephone> num_telephone;

	public TelephoneDAO() {

		this.num_telephone = new ArrayList<Telephone>();
	}

	@Override
	public void ajouter(Telephone object) {
		num_telephone.add(object);

	}

	@Override
	
	public Telephone find(int id) {
		for (Telephone tel : num_telephone) {
			if (Integer.parseInt(tel.getNumero()) == id) {
				
				return tel;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Telephone> findAll() {
		return (ArrayList<Telephone>) num_telephone.clone();

	}

	@Override
	public Telephone update(Telephone obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Telephone obj) {
		num_telephone.remove(obj);

	}

}
