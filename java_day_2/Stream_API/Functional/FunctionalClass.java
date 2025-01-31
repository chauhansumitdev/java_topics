package java_day_2.Stream_API.Functional;

import java.util.function.Function;


/**
 * The function interface was introduced in java to implement the functional interface .
 * represents a funciton which takes in one argument and produces a result
 * T - input
 * R - return type
 * 
 * + apply()
 * + andThen()
 * + compose()
 * + identify()
 */
public class FunctionalClass {
    public static void main(String[] args) {
        

        Function<Integer, Double> function = new Function<Integer,Double>() {
            @Override
                        public
                        Double apply(Integer value){
                            return value/5.0;
                        }
        };

        Function<Double, Double> function2 = new Function<Double,Double>() {
            @Override
            public Double apply(Double value){
                return
                 value*10.0;
            }
        };
        
        
        function.andThen(function2);

        function.andThen((a) ->{
            return a*10;
        });
        
        System.out.println(function.apply(100));

        //Function<Integer, Double> half = a -> a/2.0;
        //half.andThen(a -> a*20);


        // System.out.println(half.apply(20));

    }
}
