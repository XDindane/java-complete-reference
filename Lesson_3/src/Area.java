// Vypocet plochy kruhu.
class Area {
        public static void main(String args[]) {
                double pi, r, a;
                
                r = 10.8; // polomer kruhu
                pi = 3.1416; // priblizna hodnota pi
                
                a = pi * r * r; // vypocet plochy
                
                System.out.println("Plocha kruhu je " + a);
        }
}
