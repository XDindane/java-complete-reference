// Telo smycky muze byt v Jave prazdne.
class NoBody {
        public static void main(String args[]) {
                int i, j;
                
                i = 100;
                j = 200;
                
                // vyhledani stredni hodnoty mezi i a j
                while(++i < --j); // tato smycka nema zadne telo
                System.out.println("Stredni hodnota je " + i);
        }
}
