package Dao;

import java.io.IOException;

import Abdelhafid.pglp_5_1.Personnel.AffichageParGroupe;
import Abdelhafid.pglp_5_1.Personnel.GroupePersonnel;
import Abdelhafid.pglp_5_1.Personnel.Personnel;
import Abdelhafid.pglp_5_1.Personnel.Telephone;

public class FactoryDao {
	
	public static Dao<Telephone> getNumeroTelephoneDAO()
            throws IOException {
        return new TelephoneDAO();
    }

	public static Dao<Personnel> getPersonnelDAO()
            throws IOException {
        return new PersonnelDAO();
    }
	
	
	public static Dao<GroupePersonnel> getGroupePersonnelDAO()
            throws IOException {
        return new GroupePersonnelDAO();
    }
	
	public static Dao<AffichageParGroupe> getAffichageParGroupeDAO()
            throws IOException {
        return new AffichageParGroupeDAO();
    }
	
	
	
	
	
	
	
	
}
