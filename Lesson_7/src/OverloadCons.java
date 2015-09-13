/* V teto verzi trida Krabice umoznuje pouziti tri ruznych pretizenych
konstruktoru k inicializaci rozmeru krabice. 
*/

class Krabice {
        double sirka;
        double vyska;
        double hloubka;
        
        // Toto je konstruktor, ktery se pouziva pri zadani vsech tri rozmeru 
        Krabice(double w, double h, double d) {
                sirka = w;
                vyska = h;
                hloubka = d;
        }        
        
        // Toto je konstruktor, ktery se pouziva bez zadani jakehokoliv rozmeru 
        Krabice() {
                sirka = -1;    // pouzitim hodnoty -1 budete
                vyska = -1;    // indikovat to, ze se jedna o
                hloubka = -1;  // neinicializovanou krabici
        }        
        
        // Toto je konstruktor, ktery se pouziva pri zadani jednoho rozmeru 
        Krabice(double len) {
                sirka = vyska = hloubka = len;
        }        
        
        // vypocet a vraceni objemu krabice
        double objem() {
                return sirka * vyska * hloubka;
        }
}

class OverloadCons {
        public static void main(String args[]) {
                // vytvareni objektu tridy Krabice pomoci ruznych konstruktoru
                Krabice mojekrabice1 = new Krabice(10, 20, 15);
                Krabice mojekrabice2 = new Krabice();
                Krabice mojekrabice3 = new Krabice(7);
                
                double obj;
                
                // nacteni objemu prvni krabice
                obj = mojekrabice1.objem();
                System.out.println("Objem krabice 1 je " + obj);
                
                // nacteni objemu druhe krabice
                obj = mojekrabice2.objem();
                System.out.println("Objem krabice 2 je " + obj);
                
                // nacteni objemu treti krabice
                obj = mojekrabice3.objem();
                System.out.println("Objem krabice 3 je " + obj);
        }
}
