// Ukazka vyuziti vlastnosti varargs.
class VarArgs {
        
        // Metoda vaTest() nyni vyuziva varargs.
        static void vaTest(int ... v) {
                System.out.print("Pocet argumentu: " + v.length + " Obsah: ");
                
                for(int x : v)
                        System.out.print(x + " ");
                System.out.println();
        }
        public static void main(String args[])
        {
                // Vsimnete si, jakym zpusobem muzete metodu vaTest()
                // volat s promennym poctem argumentu.
                vaTest(10); // volani s 1 argumentem
                vaTest(1, 2, 3); // volani se 3 argumenty
                vaTest(); // volani bez argumentu
        }
}
