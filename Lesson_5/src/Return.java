// Ukazka pouziti prikazu return.
class Return {
        public static void main(String args[]) {
                boolean t = true;
                
                System.out.println("Pred prikazem return.");
                
                if(t) return; // navrat do volajiciho programu
                
                System.out.println("Tento prikaz se neprovede.");
        }
}
