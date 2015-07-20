// Ukazka explicitniho pretypovani.
class Conversion {
        public static void main(String args[]) {
                byte b;
                int i = 257;
                double d = 323.142;
                
                System.out.println("\nKonverze typu int na byte.");
                b = (byte) i;
                System.out.println("Hodnoty i a b jsou " + i + " " + b);
                
                System.out.println("\nKonverze typu double na int.");
                i = (int) d;
                System.out.println("Hodnoty d a i jsou " + d + " " + i);
                
                System.out.println("\nKonverze typu double na byte.");
                b = (byte) d;
                System.out.println("Hodnoty d a b jsou " + d + " " + b);
        }
}
