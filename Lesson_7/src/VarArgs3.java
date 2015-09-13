// Metody s promennym poctem argumentu a pretezovani.
class VarArgs3 {
        
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
                        " Pocet argumentu: " + v.length +
                        " Obsah: ");
                
                for(boolean x : v)
                        System.out.print(x + " ");
                System.out.println();
        }
        
        static void vaTest(String msg, int ... v) {
                System.out.print("vaTest(String, int ...): " +
                        msg + v.length +
                        " Obsah: ");
                
                for(int x : v)
                        System.out.print(x + " ");
                System.out.println();
        }

        public static void main(String args[])
        {
                vaTest(1, 2, 3);
                vaTest("Testovani: ", 10, 20);
                vaTest(true, false, false);
        }
}
