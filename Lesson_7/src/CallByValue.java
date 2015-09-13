// Primitivni datove typy jsou predavany hodnotou.
class Test {
        void meth(int i, int j) {
                i *= 2;
                j /= 2;
        }
}

class CallByValue {
        public static void main(String args[]) {
                Test ob = new Test();
                int a = 15, b = 20;

                System.out.println("Hodnoty a a b pred volanim: " +
                        a + " " + b);
                ob.meth(a, b);
                System.out.println("Hodnoty a a b po volani: " +
                        a + " " + b);
        }
}
