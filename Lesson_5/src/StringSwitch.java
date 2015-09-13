// Pouziti retezce k rizeni prikazu switch.
class StringSwitch {
        public static void main(String args[]) {
                String str = "dve";
                switch(str) {
                case "jedna":
                        System.out.println("jedna");
                        break;
                case "dve":
                        System.out.println("dve");
                        break;
                case "tri":
                        System.out.println("tri");
                        break;
                default:
                        System.out.println("zadna shoda");
                        break;
                }
        }
}
