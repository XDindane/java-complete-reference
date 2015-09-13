// Pri pretezovani metod je nutne zvazit i automatickou konverzi typu.
class OverloadDemo {
        void test() {
                System.out.println("Bez parametru");
        }
        
        // Pretizena metoda test se dvema parametry typu int.
        void test(int a, int b) {
                System.out.println("int a a int b: " + a + " " + b);
        }

        // Pretizena metoda test s jednim parametrem typu double.
        void test(double a) {
                System.out.println("Hodnota a uvnitr metody test(double): " + a);
        }
}

class Overload2 {
        public static void main(String args[]) {
                OverloadDemo ob = new OverloadDemo();
                int i = 88;
                
                ob.test();
                ob.test(10, 20);
                
                ob.test(i); // toto zpusobi volani metody test(double)
                ob.test(123.2); // toto tako zpusobi volani metody test(double)
        }
}

