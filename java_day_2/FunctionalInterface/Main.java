package java_day_2.FunctionalInterface;

public class Main {
    
    public static void main(String[] args) {
        
        Add add = new Add(){

            @Override
            public int add(int a, int b){
                return a+b;
            }
        };



        int value = add.add(10, 20);

        System.out.println(value);


        Add add_again = (a,b) ->{
            return a+b;
        };

        System.out.println(add_again.add(20, 20));

        System.out.println(add.add(10.0, 0.1));

        Add.print();

    }

}
