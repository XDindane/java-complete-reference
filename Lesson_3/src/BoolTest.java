// Ukazka prace s promennymi typu boolean.
class BoolTest {
        public static void main(String args[]) {
                boolean b;
                
                b = false;
                System.out.println("Hodnota b je " + b);
                b = true;
                System.out.println("Hodnota b je " + b);
                
                // hodnota typu boolean muze ridit prikaz if
                if(b) System.out.println("Tento prikaz bude proveden.");
                
                b = false;
                if(b) System.out.println("Tento prikaz nebude proveden.");
                
                // vystupem relacnich operatoru je hodnota typu boolean
                System.out.println("10 > 9 je " + (10 > 9));
        }
}
