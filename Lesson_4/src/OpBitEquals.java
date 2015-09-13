class OpBitEquals {
        public static void main(String args[]) {
                int a = 1;
                int b = 2;
                int c = 3;
                
                a |= 4;
                b >>= 1;
                c <<= 1;
                a ^= c;
                System.out.println("Hodnota a = " + a);
                System.out.println("Hodnota b = " + b);
                System.out.println("Hodnota c = " + c);
        }
}
