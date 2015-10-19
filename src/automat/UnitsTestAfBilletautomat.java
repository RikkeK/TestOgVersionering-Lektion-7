package automat;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitsTestAfBilletautomat {

	@Test
	public void testGetBilletpris() {
		Billetautomat automat = new Billetautomat();
		assertEquals(10, automat.getBilletpris());
	}
	
	@Test
	public void testReturErNulHvisManIkkeHarSatPengeInd() {
		Billetautomat automat = new Billetautomat();
		assertEquals(0, automat.returpenge());
	}
	
	@Test
	//Tjek af at man ikke kan sætte en billet til negative værdier
	public void testAtManIkkeKanSætteBilletprisTilNegativeVærdier() {
		Billetautomat automat = new Billetautomat();
		automat.montørLogin("1234");
		automat.setBilletpris(-20);
		assertEquals(10, automat.getBilletpris());
	}
		
	
	@Test
	//Tjek af at man ikke ændre billetpris uden at være logget ind som montør
	public void testAtManIkkeKanÆndreBilletPrisUdenAtVæreLoggetInd() {
		Billetautomat automat = new Billetautomat();
		automat.setBilletpris(20);
		assertEquals(10, automat.getBilletpris());	
	}
	
	@Test
	//Tjek at ved ændring af billetpris, ikke ændre pris for de tidligere købte billeter
	public void testAtManVedÆndringAfBilletprisIkkeÆndrePrisForTidligereKøbteBilleter() {
		Billetautomat automat = new Billetautomat();
		automat.indsætPenge(20);
		automat.udskrivBillet();
		automat.montørLogin("1234"); 
		int gammelindkomst = automat.getTotal();
		automat.setBilletpris(100);
		int nyindkomst = automat.getTotal();
		assertEquals(gammelindkomst, nyindkomst);		
		}
	}


