// Tento program pouziva parametrizovanou metodu.

class Krabice {
        double sirka;
        double vyska;
        double hloubka;
        
        // vypocet a vraceni objemu krabice
        double objem() {
                return sirka * vyska * hloubka;
        }
        
        // nastaveni rozmeru krabice
        void nastavRozmery(double w, double h, double d) {
                sirka = w;
                vyska = h;
                hloubka = d;
        }
}

class KrabiceDemo5 {
        public static void main(String args[]) {
                Krabice mojekrabice1 = new Krabice();
                Krabice mojekrabice2 = new Krabice();
                double obj;
                
                // inicializace kazde krabice
                mojekrabice1.nastavRozmery(10, 20, 15);
                mojekrabice2.nastavRozmery(3, 6, 9);
                
                // nacteni objemu prvni krabice
                obj = mojekrabice1.objem();
                System.out.println("Objem krabice 1 je " + obj);
                
                // nacteni objemu druhe krabice
                obj = mojekrabice2.objem();
                System.out.println("Objem krabice 2 je " + obj);
        }
}
