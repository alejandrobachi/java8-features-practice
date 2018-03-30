package thebachi.java8practice.bo;

import thebachi.java8practice.model.Career;
import thebachi.java8practice.model.IMyFunctionalInterface;
import thebachi.java8practice.model.Subject;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

public class Java8SimpleExamples {

   public static void main(String [] args){

   }


   public int sumar(int [] numbers){
      return Arrays.stream(numbers).sum();
   }

   public OptionalInt max(int [] numbers){
      return Arrays.stream(numbers).max();
   }

   public List<String> getAllSubjectsNames(List<Career> lista){
      return lista.stream().flatMap(i->i.getSubjectList().stream()).map(Subject::getName).distinct().collect(Collectors.toList());
   }

   public void someLambdaFunctions(){
      IMyFunctionalInterface iMyFunctionalInterfaceImp = (x,y)-> System.out.println(y+" "+x);
      iMyFunctionalInterfaceImp.theAbstractMethod(1,"sass");
   }



}
