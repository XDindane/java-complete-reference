// Trida Krabice nyni pouziva k inicializaci rozmeru krabice konstruktor.

class Krabice {
        double sirka;
        double vyska;
        double hloubka;
        
        // Toto je konstruktor tridy Krabice
        Krabice() {
                System.out.println("Inicializace Krabice");
                sirka = 10;
                vyska = 10;
                hloubka = 10;
        }        
        
        // vypocet a vraceni objemu krabice
        double objem() {
                return sirka * vyska * hloubka;
        }
}

class KrabiceDemo6 {
        public static void main(String args[]) {
                // deklarace, alokace a inicializace objektu tridy Krabice
                Krabice mojekrabice1 = new Krabice();
                Krabice mojekrabice2 = new Krabice();
                
                double obj;
                
                // nacteni objemu prvni krabice
                obj = mojekrabice1.objem();
                System.out.println("Objem krabice 1 je " + obj);
                
                // nacteni objemu druhe krabice
                obj = mojekrabice2.objem();
                System.out.println("Objem krabice 2 je " + obj);
        }
}
