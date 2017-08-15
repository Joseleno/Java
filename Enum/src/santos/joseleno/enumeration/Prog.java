package santos.joseleno.enumeration;

public class Prog {

	public static void main(String[] args) {
		
		College college = new College();
		college.setNom("Gestion d'affaires");
		college.setHeures(1800);
		college.setTournee(Tournee.MATIN);
 
        System.out.println("Collège - " + college.getNom()
                + " Offert le quart du "
                + college.getTournee().getDescription() + 
                " Heures Totales - " + college.getHeures() +"h");
	}

}
