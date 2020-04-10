package Abdelhafid.pglp_5_1.Personnel;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Personnel implements PersonnelInterface, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1350092881346723535L;

	private final String Nom;
	private final String Prenom;
	private List<Telephone> num_telephones;

	private final String fonction;
	private final LocalDate date_naissance;

	private Personnel(PersonnelBuilder builder) {

		Nom = builder.Nom;
		Prenom = builder.Prenom;
		fonction = builder.fonction;
		date_naissance = builder.date_naissance;
		num_telephones = builder.num_telephones;

	}

	/* Builder */

	public static class PersonnelBuilder {

		private final String Nom;
		private final String Prenom;
		private final String fonction;
		private List<Telephone> num_telephones = new ArrayList<Telephone>();
		private LocalDate date_naissance;

		public PersonnelBuilder(String nom, String prenom, String fonction) {

			this.Nom = nom;
			this.Prenom = prenom;
			this.fonction = fonction;
		}

		public PersonnelBuilder Naissance(LocalDate naissance) {

			this.date_naissance = naissance;
			return this;

		}

		public PersonnelBuilder ajouter_numero(Telephone Tel_numero) {
			this.num_telephones.add(Tel_numero);
			return this;
		}

		public Personnel build() {
			return new Personnel(this);
		}

	}

	public List<Telephone> getNum_telephones() {

		return num_telephones;
	}

	public LocalDate getDate_naissance() {
		return date_naissance;
	}

	public String getNom() {
		return Nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public String getFonction() {
		return fonction;
	}

	public void print() {
			System.out.println(Nom + " " + Prenom + " \nFonction: " 
			+ fonction + "\ndate de naissance: "+ date_naissance);
			for (Telephone phone : num_telephones) {
			System.out.println( "typeTéléphone : " + phone.getTel_type() +" **"+ 
					"  numero:" +phone.getNumero());}
			System.out.println("\n");
		
	}
}
			
		


