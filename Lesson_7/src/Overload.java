// Ukazka pretezovani metod.
class OverloadDemo {
        void test() {
                System.out.println("Bez parametru");
        }
        
        // Pretizena metoda test s jednim parametrem typu int.
        void test(int a) {
                System.out.println("int a: " + a);
        }
        
        // Pretizena metoda test se dvema parametry typu int.
        void test(int a, int b) {
                System.out.println("int a a int b: " + a + " " + b);
        }
        
        // Pretizena metoda test s jednim parametrem typu double.
        double test(double a) {
                System.out.println("double a: " + a);
                return a*a;
        }
}

class Overload {
        public static void main(String args[]) {
                OverloadDemo ob = new OverloadDemo();
                double result;
                
                // volani vsech verzi metody test()
                ob.test();
                ob.test(10);
                ob.test(10, 20);
                result = ob.test(123.25);
                System.out.println("Vysledek volani ob.test(123.25): " + result);
        }
}
