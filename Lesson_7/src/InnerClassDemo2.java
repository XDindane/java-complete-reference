// Tento program nebude mozne zkompilovat.
class Vnejsi {
        int outer_x = 100;
        
        void test() {
                Vnitrni inner = new Vnitrni();
                inner.display();
        }

        // toto je vnitrni trida
        class Vnitrni {
                int y = 10; // y je lokalni promennou tridy Vnitrni
                void display() {
                        System.out.println("Zobrazeni: hodnota outer_x = " + outer_x);
                }
        }

        void showy() {
                System.out.println(y); // chyba, promenna y zde neni znama!
        }
}

class InnerClassDemo2 {
        public static void main(String args[]) {
                Vnejsi outer = new Vnejsi();
                outer.test();
        }
}
