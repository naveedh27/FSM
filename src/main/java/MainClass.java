public class MainClass {

    public static void main(String args[]){

        Ctrlr ct = new Ctrlr();

        ct.addTransition(States.DISCONNECTED,States.CONNECTED,() -> {} );

    }
}
