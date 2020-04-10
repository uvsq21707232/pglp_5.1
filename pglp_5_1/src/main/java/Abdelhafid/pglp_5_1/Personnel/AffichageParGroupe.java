package Abdelhafid.pglp_5_1.Personnel;

import java.util.ArrayDeque;

import java.util.Iterator;

public class AffichageParGroupe implements Iterable<PersonnelInterface> {

	private ArrayDeque<PersonnelInterface> file;

	private final int identification;
	private static int Compteur = 1;

	public AffichageParGroupe() {
		identification = Compteur++;

		file = new ArrayDeque<PersonnelInterface>();
	}

	public void parcoursLargeur(final PersonnelInterface p_i) {

		if (p_i.getClass() == GroupePersonnel.class) {

			PersonnelInterface A, B;
			GroupePersonnel grp;

			file = new ArrayDeque<PersonnelInterface>();

			ArrayDeque<PersonnelInterface> temp = new ArrayDeque<PersonnelInterface>();
			temp.add(p_i);

			while (!temp.isEmpty()) {
				A = temp.pollFirst();
				file.add(A);

				if (A.getClass() == GroupePersonnel.class) {

					grp = (GroupePersonnel) A;
					Iterator<PersonnelInterface> ite = grp.iterator();

					while (ite.hasNext()) {
						B = ite.next();
						if (!temp.contains(B) && !file.contains(B)) {
							temp.add(B);

						}

					}

				}
			}

		}
	}

	public int getIdentification() {
		return identification;
	}

	public Iterator<PersonnelInterface> iterator(){

		return file.iterator();
	}

	public void add(final PersonnelInterface ip) {
		file.add(ip);
	}

	public void supp() {
		while (!file.isEmpty()) {
			file.removeFirst();
		}
	}

	public String afficherParcour() {
		String s = "";
		GroupePersonnel grp;
		// affichage du parcours

		for (PersonnelInterface f : file) {
			if (f.getClass() == GroupePersonnel.class) {
				grp = (GroupePersonnel) f;
				s += grp.getId_composite() + "\n";
			} else {
				s += ((Personnel) f).toString();
			}
		}
		return s;

	}
}
