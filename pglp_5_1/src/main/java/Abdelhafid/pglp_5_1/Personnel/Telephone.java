package Abdelhafid.pglp_5_1.Personnel;

import java.io.Serializable;

public class Telephone implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tel_type;
	private String numero;
	
	public Telephone(String tel_type, String numero) {
	
		this.tel_type = tel_type;
		this.numero = numero;
	}


	public String afficher() {
		
	return  tel_type + " -- " + numero;
	
	}

	public String getTel_type() {
		return tel_type;
	}

	

	public String getNumero() {
		return numero;
	}

	
	
	
	
	
	

}
