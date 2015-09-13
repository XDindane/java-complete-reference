// Posun doleva u hodnoty typu byte.
class ByteShift {
        public static void main(String args[]) {
                byte a = 64, b;
                int i;
                
                i = a << 2;
                b = (byte) (a << 2);
                System.out.println("Puvodni hodnota a: " + a);
                System.out.println("Hodnoty i a b: " + i + " " + b);
        }
}
