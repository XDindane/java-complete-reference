// Objekty jsou predavany prostrednictvim odkazu.

class Test {
        int a, b;
        
        Test(int i, int j) {
                a = i;
                b = j;
        }

        // predani objektu
        void meth(Test o) {
                o.a *= 2;
                o.b /= 2;
        }
}

class PassObjRef {
        public static void main(String args[]) {
                Test ob = new Test(15, 20);
                
                System.out.println("Hodnoty ob.a a ob.b pred volanim: " +
                        ob.a + " " + ob.b);
                
                ob.meth(ob);
                
                System.out.println("Hodnoty ob.a a ob.b po volani: " +
                        ob.a + " " + ob.b);
        }
}
