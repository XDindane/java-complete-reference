class StaticDemo {
        static int a = 42;
        static int b = 99;
        
        static void callme() {
                System.out.println("Hodnota a = " + a);
        }
}

class StaticByName {
        public static void main(String args[]) {
                StaticDemo.callme();
                System.out.println("Hodnota b = " + StaticDemo.b);
        }
}
