package Stream;

import java.util.Arrays;

public class LetterCount {

    public static void main(String[] args) {
        System.out.println(getTotalNumberOfLetterOfNamesLongerThanFive("ali","veli","ahmet","VeliBaba"));
    }


     /*

        2.Calisma

        Array elemanlarini al                                           ⇒ **stream()**

        5’ten uzun isimleri filtrele                                    ⇒ **filter()**

        Geri kalan listedeki tum harflerin sayisini getir               ⇒ **mapToInt()**

        harf sayilarini topla                                           ⇒ **sum()**

    */

        public static int getTotalNumberOfLetterOfNamesLongerThanFive(String... names){
            return Arrays.stream(names)
                    .filter(name -> name.length()>5)
                    .mapToInt(String::length)
                    .sum();
        }

}
