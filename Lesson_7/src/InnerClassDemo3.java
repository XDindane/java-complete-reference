// Definice vnitrni tridy v ramci smycky for.
class Vnejsi {
        int outer_x = 100;
        
        void test() {
                for(int i=0; i<10; i++) {
                        class Vnitrni {
                                void display() {
                                        System.out.println("Zobrazeni: hodnota outer_x = " + outer_x);
                                }
                        }
                        Vnitrni inner = new Vnitrni();
                        inner.display();
                }
        }
}

class InnerClassDemo3 {
        public static void main(String args[]) {
                Vnejsi outer = new Vnejsi();
                outer.test();
        }
}
