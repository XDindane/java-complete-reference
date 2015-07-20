/*
	Ukazka pouziti bloku kodu.
	Tento kod ulozte do souboru s nazvem "BlockTest.java"
*/
class BlockTest {
	public static void main(String args[]) {
		int x, y;
		y = 20;
		
		// cilem nasledujici smycky je blok kodu
		for(x = 0; x<10; x++) {
			System.out.println("Hodnota x je: " + x);
			System.out.println("Hodnota y je: " + y);
			y = y - 2;
		}
	}
}
