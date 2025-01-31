package java_day_2.Stream_API;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class StreamLearn {

    public static void main(String[] args) {

        List<Integer> list = create_list();
        List<Double> double_list = create_double_list();
        
        // filter(list);
        // map(list);
        // distinct(list);
        // sort_list(list);
        // peek_list(list);
        // limit_list(list);
        // using_for_each(list);
        //reducing_list(list);
        collect_list(list);

    }

    public static List<Double> create_double_list(){
        
        List<Double> double_list = new ArrayList<>();

        for(int i=0;i<10;i++){
            double_list.add((double)i/3);
        }

        return double_list;
    }

    public static List<Integer> create_list(){
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<20;i++){
            list.add(i);
        }

        list.add(5);
        list.add(33);

        return list;
    }

    public static void map(List<Integer> list){


        Function<Integer, Integer> mapper = new Function<Integer,Integer>() {
            @Override
            public Integer apply(Integer integer){
                return integer*2;
            }
        };

        List<Integer> mapped = list.stream().map(mapper).toList();

        System.out.println(" Mapped values : ");

        for(Integer value : mapped){
            System.out.print(value);
        }
    }

    public static void filter(List<Integer> list){

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer value){
                return value < 5;
            }
        };

        List<Integer> filter = list.stream().filter(predicate).toList();

        System.out.println(" Filtered values : ");

        for(Integer value : filter){
            System.out.print(value);
        }
    }

    public static void distinct(List<Integer> list){

        List<Integer> values = list.stream().distinct().toList();

        System.out.println(  " DISTINCT ELEMENTS : "+values );

    }

    public static void sort_list(List<Integer> list){

        List<Integer> values = list.stream().sorted( (a,b)-> Integer.compare(b, a)).toList();

        System.out.println(" DESCENDING ORDER : " + values);


    }

    public static void peek_list(List<Integer> list){
        System.out.print(" USING PEEK : ");

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer value){
                System.out.print(value+" ");
            }
        };

        List<Integer> values = list.stream().peek(consumer).toList();

    }

    public static void limit_list(List<Integer> list){

        List<Integer> value = list.stream().limit(5).toList();

        System.out.println(" LIMTING LIST TO 5 : "+ value);

    }

    public static void using_for_each(List<Integer> list){
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer){
                System.out.print(integer*10+" ");
            }
        };

        System.out.print(" USING FOR EACH : ");
        list.stream().forEach(consumer);
    }

    public static void reducing_list(List<Integer> list){

        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer one, Integer two){
                return one+two;
            }
        };

        int value = list.stream().reduce(0, binaryOperator);

        System.out.println(value);
    }

    public static void collect_list(List<Integer> list){

        Set<Integer> values = list.stream().collect(Collectors.toSet());

        System.out.println(" COLLECTED LIST : "+ values);

    }

}