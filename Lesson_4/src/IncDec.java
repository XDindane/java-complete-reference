// Ukazka prace s operatorem ++.
class IncDec {
        public static void main(String args[]) {
                int a = 1;
                int b = 2;
                int c;
                int d;
                c = ++b;
                d = a++;
                c++;
                System.out.println("Hodnota a = " + a);
                System.out.println("Hodnota b = " + b);
                System.out.println("Hodnota c = " + c);
                System.out.println("Hodnota d = " + d);
        }
}
