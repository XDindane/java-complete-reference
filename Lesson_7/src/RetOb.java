// Ukazka vraceni objektu.
class Test {
        int a;
        
        Test(int i) {
                a = i;
        }

        Test incrByTen() {
                Test temp = new Test(a+10);
                return temp;
        }
}

class RetOb {
        public static void main(String args[]) {
                Test ob1 = new Test(2);
                Test ob2;
                
                ob2 = ob1.incrByTen();

                System.out.println("Hodnota ob1.a: " + ob1.a);
                System.out.println("Hodnota ob2.a: " + ob2.a);
                ob2 = ob2.incrByTen();
                System.out.println("Hodnota ob2.a po druhem navyseni: "
                        + ob2.a);
        }
}
