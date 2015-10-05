package automat;

public class TjekNegativeBeloeb
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;
		
		retur = automat.getBilletpris();
		if (retur != 10) {
			System.out.println("FEJL, getBilletpris() != 10");
		}

		System.out.println("*** Tjek af salg af en billet");
		automat.indsætPenge(-10);
		automat.udskrivBillet();
		retur = automat.returpenge();
		if (retur != 0) {
			System.out.println("FEJL, returpenge() skulle give 0, men den gav: "+retur);
			antalFejl = antalFejl + 1;
		}

		System.out.println("*** Tjek af, at penge kan komme retur (negativ)");
		automat.indsætPenge(-10);
		automat.udskrivBillet();
		retur = automat.returpenge();
		if (retur != 0) {
			System.out.println("FEJL, returpenge() skulle give -110, men den gav: "+retur);
			antalFejl = antalFejl + 1;
		}
		

		System.out.println("*** Tjek af andre billetpriser");
		automat.setBilletpris(-20);
		automat.indsætPenge(100);
		automat.udskrivBillet();
		retur = automat.returpenge();
		if (retur != 80) {
			System.out.println("FEJL, returpenge() skulle give 80, men den gav: "+retur);
			antalFejl = antalFejl + 1;
		}
		retur = automat.getAntalBilletterSolgt();
		if (retur != 3) {
			System.out.println("FEJL, AntalBilletterSolgt() skulle give 3, men den gav: "+retur);
			antalFejl = antalFejl + 1;
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("Der blev fundet "+antalFejl+" fejl i automaten");
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, ØV!!!");			
		}
	}
}