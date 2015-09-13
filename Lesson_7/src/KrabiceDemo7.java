/* Trida Krabice nyni pouziva k inicializaci rozmeru krabice 
parametrizovany konstruktor.
*/

class Krabice {
        double sirka;
        double vyska;
        double hloubka;
        
        // Toto je konstruktor tridy Krabice
        Krabice(double w, double h, double d) {
                sirka = w;
                vyska = h;
                hloubka = d;
        }        
        
        // vypocet a vraceni objemu krabice
        double objem() {
                return sirka * vyska * hloubka;
        }
}

class KrabiceDemo7 {
        public static void main(String args[]) {
                // deklarace, alokace a inicializace objektu tridy Krabice
                Krabice mojekrabice1 = new Krabice(10, 20, 15);
                Krabice mojekrabice2 = new Krabice(3, 6, 9);
                
                double obj;
                
                // nacteni objemu prvni krabice
                obj = mojekrabice1.objem();
                System.out.println("Objem krabice 1 je " + obj);
                
                // nacteni objemu druhe krabice
                obj = mojekrabice2.objem();
                System.out.println("Objem krabice 2 je " + obj);
        }
}
