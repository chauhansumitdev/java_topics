package java_day_2.FunctionalInterface;

// functional interface can have multiple default and static methods but only one abstract methods.
// four different kind of functional interfacs 
// consumer
// predicate
// function
// supplier

@FunctionalInterface
public interface Add {
    
    public int add(int a, int b);

    public default double add(double a, double b){
        return a+b;
    }

    public static void print(){
        System.out.println(" STATIC METHOD IN THE INTERFACE ADD ");
    }
}
