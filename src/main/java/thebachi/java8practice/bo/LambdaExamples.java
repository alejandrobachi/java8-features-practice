package thebachi.java8practice.bo;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaExamples {



    public boolean predicateExample(){
        PredicateExample predicateExample = (s,i) -> true;
        return predicateExample.test("s",2);
    }

    public String functionExample(Long longo){
        Function<Long,String> function = l-> {
            l= l + 3L;
           return  l.toString();
        };
        return function.apply(longo);
    }

    public void consumerExample(String food){
        //old style

        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        stringConsumer.accept(food);

        //Java 8
        Consumer<String> stringConsumer1 = System.out::println;
        stringConsumer1.accept(food);

    }

    public String supplierExample() {
        Supplier<String> gimmeSome = () ->"sss";
        return gimmeSome.get();
    }

    public int unaryOperatorExample(int value){
    //Unary operator is a function with the same input and return type
        UnaryOperator<Integer> unaryIncrementor = i-> i++;
        return unaryIncrementor.apply(value);

    }

    interface PredicateExample{
        boolean test(String s, int i);
    }






}
