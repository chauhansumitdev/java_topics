package java_day_2.Stream_API.PredicateClassJava;

import java.util.function.Predicate;

/**
 * A predicate in programming is a function that evalues a logical condition and returns a true and false
 */
public class PredicateLearn {

    public static void main(String[] args) {

        Predicate<Integer> predicate_anonymous = new Predicate<Integer>() {
            @Override
            public boolean test(Integer val){
                return val > 5;
            }
        };


        Predicate<Integer> predicate  = (a) ->{
            return  a > 100;
        };

        System.out.println(predicate.test(10));
        System.out.println(predicate.test(1000));

        System.out.println(predicate_anonymous.test(2));

    }
}