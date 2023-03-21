package Stream;

import java.util.List;

public class SumAndReduce {

    public static void main(String[] args) {

    }

    public static int calculate(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    // redcue(), buyuk bir parcayi alip azaltarak sonuna kadar gidiyor. Her Dongude bir tanesini alip bir butunden cikarip sonucu bir seye esitliyor.
    public static int calculate2(List<Integer> numbers) {


        return numbers.stream()
                .reduce(Integer::sum).orElse(0);
    }



}
