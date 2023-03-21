package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        Collection<String>deneme= (Collection<String>) mapToUpperCase2("ali","veli","ahmet","zeynep");

        System.out.println(deneme);
    }



    // stream(), map(), collect()

    public  static Collection<String> mapToUpperCase(String... names){
        Collection<String> upperCaseNames = new ArrayList<>();

        for (String name : names ) {
            upperCaseNames.add(name.toUpperCase());
        }

        return upperCaseNames;

    }


        //  Array elemanlarının tamamını al        ⇒ stream()
        //  Büyük harflere çevir                   ⇒ map()
        //  liste olarak geri dön                  ⇒ collect()


    public static Collection<String> mapToUpperCase2(String... names){
        return Arrays.stream(names).map(String::toUpperCase).collect(Collectors.toList());
    }


}
