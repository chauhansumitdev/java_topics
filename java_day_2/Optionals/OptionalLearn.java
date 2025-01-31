package java_day_2.Optionals;

import java.lang.StackWalker.Option;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * helps to handle null pointer exception in a safer way
 * its a contains that contains/may not contain a value
 * useful functions -
 * + isPresent()
 * + get()
 */

public class OptionalLearn {
    
    public static void main(String[] args) {

        Optional<Integer> container = Optional.of(100);
        
        // ofNullable(T value)

       Optional<Integer> empty_optional = Optional.empty();


       Predicate<Integer> predicate = new Predicate<Integer>() {
        @Override
        public boolean test(Integer value){
            if(value == 100){
                return true;
            }

            return false;
        }
       };

       int value = container.get();

       try{
        empty_optional.get();
       }catch(Exception e){
        System.out.println(" HANDLING EXCEPTION ");
       }

       Optional<Integer> filter_operation = container.filter(predicate);

       System.out.println( " USING FILTER "+ filter_operation.isPresent());

       if(container.isPresent()){
        System.out.println(" CONTAINER CONTAINS A VALUE ");
       }

       int using_or_get = empty_optional.orElse(5);

       System.out.println(" USING OR GET "+  using_or_get);

    }

}
