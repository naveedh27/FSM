import java.util.HashMap;
import java.util.function.Supplier;

public class Ctrlr<S> {

    public HashMap<S, HashMap<S, Transition>> graph = new HashMap<>();

    public static States currentState = States.DISCONNECTED;


    public void addTransition(S from, S to, Supplier<Void> action) {

        graph.putIfAbsent(from, new HashMap<>());
        graph.putIfAbsent(to, new HashMap<>());
        graph.get(from).put(to, new Transition(from, to, action));

    }

    public void goTo(S to){
        Transition transition = graph.get(this.currentState).get(to);
        transition.action.get();
    }

    public static void connect(){
        System.out.println("Connect getting called");
    }

}
