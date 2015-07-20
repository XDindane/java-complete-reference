// Ukazka rozsahu platnosti bloku kodu.
class Scope {
        public static void main(String args[]) {
                int x; // s touto promennou muze pracovat veskery kod v ramci main
                
                x = 10;
                if(x == 10) { // zacatek noveho rozsahu platnosti
                        int y = 20; // tato promenna je znama pouze v ramci tohoto bloku
                        
                        // v tuto chvili jsou zname obe promenne x a y
                        System.out.println("Hodnota x a hodnota y: " + x + " " + y);
                        x = y * 2;
                }
                // y = 100; // Chyba! Promenna y zde neni znama
                
                // Ale promenna x zde je stale znama
                System.out.println("Hodnota x je " + x);
        }
}
