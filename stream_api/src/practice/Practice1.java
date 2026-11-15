package src.practice;

import java.util.List;

public class Practice1 {
    public static void main(String[] args){
        List<String> names = List.of("Ankit", "Ravi", "Amit", "John", "Ajay");
        practice(names);
    }

    public static void practice(List<String> names){
        List<String> filerStartWithA = names.stream().filter(name -> name.startsWith("A")).toList();
        System.out.println(filerStartWithA);

        List<String> toUpperCase = names.stream().map(name -> name.toUpperCase()).toList();

        List<String> countLength = names.stream().filter(name -> name.length()>4).toList();
    }
}
