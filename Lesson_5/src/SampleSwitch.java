// Jednoducha ukazka pouziti prikazu switch.
class SampleSwitch {
        public static void main(String args[]) {
                for(int i=0; i<6; i++)
                switch(i) {
                case 0:
                        System.out.println("i je nula.");
                        break;
                case 1:
                        System.out.println("i je jedna.");
                        break;
                case 2:
                        System.out.println("i je dve.");
                        break;
                case 3:
                        System.out.println("i je tri.");
                        break;
                default:
                        System.out.println("i je vetsi nez tri.");
                }
        }
}
