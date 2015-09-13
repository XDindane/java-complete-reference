// Ukazka definice vnitrni tridy.
class Vnejsi {
        int outer_x = 100;
        
        void test() {
                Vnitrni inner = new Vnitrni();
                inner.display();
        }

        // toto je vnitrni trida
        class Vnitrni {
                void display() {
                        System.out.println("Zobrazeni: hodnota outer_x = " + outer_x);
                }
        }
}

class InnerClassDemo {
        public static void main(String args[]) {
                Vnejsi outer = new Vnejsi();
                outer.test();
        }
}

