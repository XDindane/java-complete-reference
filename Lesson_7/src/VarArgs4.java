// Varargs metody, pretezovani a nejednoznacnost.
//
// Tento program obsahuje chybu a nebude mozne
// jej zkompilovat!
class VarArgs4 {
        
        static void vaTest(int ... v) {
                System.out.print("vaTest(int ...): " +
                        "Pocet argumentu: " + v.length +
                        " Obsah: ");
                
                for(int x : v)
                        System.out.print(x + " ");
                System.out.println();
        }
        
        static void vaTest(boolean ... v) {
                System.out.print("vaTest(boolean ...) " +
                        "Pocet argumentu: " + v.length +
                        " Obsah: ");
                
                for(boolean x : v)
                        System.out.print(x + " ");
                System.out.println();
        }
        
        public static void main(String args[])
        {
                vaTest(1, 2, 3); // OK
                vaTest(true, false, false); // OK
                
                vaTest(); // Chyba: nejednoznacne!
        }
}
