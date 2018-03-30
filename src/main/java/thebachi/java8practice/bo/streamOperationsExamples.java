package thebachi.java8practice.bo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamOperationsExamples {

    public void flatMapExample(List<List<String>> listList){
        List<String> list= listList.stream().flatMap(List::stream)
                .collect(Collectors.toList());
    }

    public int reduceSumExample(int [] numbers){
        return Arrays.stream(numbers).reduce(0,(x,y) -> x +y );
    }

}
