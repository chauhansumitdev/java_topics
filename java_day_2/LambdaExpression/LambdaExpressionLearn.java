package java_day_2.LambdaExpression;

public class LambdaExpressionLearn {

    public static void main(String[] args) {
        
        Multiply multiply = (a,b) -> {
            return a*b;
        };

        System.out.println(multiply.multiply(10, 10));

    }

}

