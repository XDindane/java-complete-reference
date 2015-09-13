// Pouziti prikazu break s navestim jako "civilizovane" formy prikazu goto.
class Break {
        public static void main(String args[]) {
                boolean t = true;
                
                first: {
                        second: {
                                third: {
                                        System.out.println("Pred prikazem break.");
                                        if(t) break second; // opusteni bloku second
                                        System.out.println("Tento prikaz se neprovede.");
                                }
                                System.out.println("Tento prikaz se neprovede.");
                        }
                        System.out.println("Toto je prikaz, nasledujici po bloku second.");
                }
        }
}
