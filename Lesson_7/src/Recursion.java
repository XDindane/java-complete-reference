// Jednoduchy priklad rekurze.
class Factorial {
        // toto je rekurzivni metoda
        int fact(int n) {
                int result;
                
                if(n==1) return 1;
                result = fact(n-1) * n;
                return result;
        }
}

class Recursion {
        public static void main(String args[]) {
                Factorial f = new Factorial();
                
                System.out.println("Faktorial 3 je " + f.fact(3));
                System.out.println("Faktorial 4 je " + f.fact(4));
                System.out.println("Faktorial 5 je " + f.fact(5));
        }       
}

