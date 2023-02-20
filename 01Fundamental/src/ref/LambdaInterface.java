package ref;

@FunctionalInterface
public interface LambdaInterface<T> {
    T process(T a, T b);
    
}
