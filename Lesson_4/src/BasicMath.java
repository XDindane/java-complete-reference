// Ukazka prace se zakladnimi aritmetickymi operatory.
class BasicMath {
        public static void main(String args[]) {
                // aritmetika s celymi cisly
                System.out.println("Aritmetika s celymi cisly");
                int a = 1 + 1;
                int b = a * 3;
                int c = b / 4;
                int d = c - a;
                int e = -d;
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                System.out.println("c = " + c);
                System.out.println("d = " + d);
                System.out.println("e = " + e);
                
                // aritmetika s desetinnymi cisly
                System.out.println("\nAritmetika s desetinnymi cisly");
                double da = 1 + 1;
                double db = da * 3;
                double dc = db / 4;
                double dd = dc - a;
                double de = -dd;
                System.out.println("da = " + da);
                System.out.println("db = " + db);
                System.out.println("dc = " + dc);
                System.out.println("dd = " + dd);
                System.out.println("de = " + de);
        }
}
