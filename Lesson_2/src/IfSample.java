/*
	Ukazka pouziti prikazu if.
	Tento kod ulozte do souboru s nazvem "IfSample.java".
*/
class IfSample {
	public static void main(String args[]) {
		int x, y;
		
		x = 10;
		y = 20;
		
		if(x < y) System.out.println("Hodnota x je mensi nez hodnota y");
		
		x = x * 2;
		if(x == y) System.out.println("Hodnota x je nyni rovna hodnote y");
		
		x = x * 2;
		if(x > y) System.out.println("Hodnota x je nyni vetsi nez hodnota y");
		
		// tento prikaz nic nezobrazi
		if(x == y) System.out.println("Toto neuvidite");
	}
}
