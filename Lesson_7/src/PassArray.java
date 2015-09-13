// Ukazka pouziti pole pro predani promenneho poctu
// argumentu metode. Toto je jiz zastaraly pristup
// k reseni otazky promenneho poctu argumentu.
class PassArray {
        static void vaTest(int v[]) {
                System.out.print("Pocet argumentu: " + v.length + " Obsah: ");
                
                for(int x : v)
                        System.out.print(x + " ");
                System.out.println();
        }
        
        public static void main(String args[])
        {
                // Vsimnete si, jakym zpusobem musi byt pole
                // vytvoreno, aby do nej bylo mozne vlozit argumenty.
                int n1[] = { 10 };
                int n2[] = { 1, 2, 3 };
                int n3[] = { };
                
                vaTest(n1); // volani s 1 argumentem
                vaTest(n2); // volani se 3 argumenty
                vaTest(n3); // volani bez argumentu
        }
}
