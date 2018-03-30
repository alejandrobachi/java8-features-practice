package thebachi.java8practice.model;
@FunctionalInterface
public interface IMyFunctionalInterface {

    void theAbstractMethod(int i, String s);

    default String firstDefaultMethod(){
        return "firstDefaultMethod";
    }

    default String firstDefaultMethod(String s){
        return firstDefaultMethod()+" "+s;
    }
}
