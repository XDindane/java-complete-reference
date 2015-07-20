// Ukazka dynamicke inicializace.
class DynInit {
        public static void main(String args[]) {
                double a = 3.0, b = 4.0;
                
                // promenna c je inicializovana dynamicky
                double c = Math.sqrt(a * a + b * b);
                
                System.out.println("Delka prepony je " + c);
        }
}
