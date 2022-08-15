import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionOperation {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(4,7,1,3,8,9,2,6,10));
        Comparator<Integer> comparator = Integer::compare;
        Collections.sort(listOfIntegers,comparator);
        listOfIntegers.stream().filter(v -> v > 5).forEach(v->{
            System.out.println(v);
        });
        Collector<Integer,?,IntSummaryStatistics> collector =
                Collectors.summarizingInt(Integer::intValue);
        IntSummaryStatistics summaryStatistics = listOfIntegers.stream().collect(collector);
        System.out.println("total =" + summaryStatistics.getSum());
        System.out.println("overage ="+summaryStatistics.getAverage());

        Consumer<Integer> myComConsumer = n -> {
            System.out.println("user input =" + n);
            if (n < 5){
                System.out.println("Invalid value!");
                return;
            }
            Collections.addAll(listOfIntegers,n);
            System.out.println("values: ");
            listOfIntegers.forEach(x-> System.out.println(x+"-"));
        };
        myComConsumer.accept(12);

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Please input a number");
            int value = scanner.nextInt();
            myComConsumer.accept(value);
            System.out.println();
        }
//
//        Predicate<Integer> tester = v -> v > 5;
//        Consumer<Integer> myConsumer = n -> listOfIntegers.add(n);
//        scanner = myConsumer.
//        while (true){
//            System.out.println("Please input a number: ");
//            int value = scanner.nextInt();
//            if (value < 0 ) break;
//            if (tester.test(value))
//                myConsumer.accept(value);
//        }
//        listOfIntegers.forEach(x-> System.out.println(x + "-"));    }
}
}
