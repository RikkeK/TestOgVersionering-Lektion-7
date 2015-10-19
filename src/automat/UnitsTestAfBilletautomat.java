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
		
//	@Test
	//Tjek at man ikke kan købe billet hvis en billet hvis balancen er lig 0 eller under billetprisen
//	public void testKanIkkeKøbeBilletHvisBalanceErUnderBilletpris() {
//		Billetautomat automat = new Billetautomat();
//		automat.udskrivBillet();
//		assertEquals(0, automat.returpenge());	
		
		/*
		 * if(automat.getBalance() <= automat.getBilletpris()){
			System.out.println("Balancen er under eller lig 0: " + automat.getBalance());
			int oldbalance = automat.getBalance();
			automat.udskrivBillet(); // køb billet
			if(automat.getBalance() == oldbalance - automat.getBilletpris()){
				System.out.println("FEJL, du har netop købt en billet og har en negativ balance, "
						+ "din balance er: " + automat.getBalance());
				antalFejl = antalFejl + 1;
			}
		 */
	
	@Test
	//Tjek af at man ikke kan sætte en billet til negative værdier
	public void testAtManIkkeKanSætteBilletprisTilNegativeVærdier() {
		Billetautomat automat = new Billetautomat();
		automat.montørLogin("1234");
		automat.setBilletpris(-20);
		assertEquals(10, automat.getBilletpris());
		
	
	

		
	
		
		
	}

}
