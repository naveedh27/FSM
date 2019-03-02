import java.util.function.Supplier;

public class Transition <S> {

    final S from;
    final S to;
    final Supplier<Void> action;


    public Transition(S from, S to, Supplier<Void> action) {
        this.from = from;
        this.to = to;
        this.action = action;
    }
}
