// Pouziti promenneho poctu argumentu spolu se "standardnim" argumentem.
class VarArgs2 {
        
        // Zde msg je normalnim parametrem a v je
        // parametr varargs.
        static void vaTest(String msg, int ... v) {
                System.out.print(msg + v.length + " Obsah: ");
                
                for(int x : v)
                        System.out.print(x + " ");
                System.out.println();
        }
        
        public static void main(String args[])
        {
                vaTest("Jeden argument: ", 10);
                vaTest("Tri argumenty: ", 1, 2, 3);
                vaTest("Bez argumentu: ");
        }
}
