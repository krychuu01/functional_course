package cwiczenia;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Cwiczenia {
    public static void main(String[] args) {
//        BigInteger bigInteger0 = BigInteger.ZERO;
//        BigInteger bigInteger1 = BigInteger.ONE;
//        BigInteger bigInteger2 = BigInteger.TWO;
//        BigInteger bigInteger10 = BigInteger.TEN;
//
//        BigInteger[] bigIntegers = {bigInteger10, bigInteger1, bigInteger2, bigInteger0};
//        boolean isBigIntegersSorted = isSorted(bigIntegers);
//        System.out.println(isBigIntegersSorted);
//
//        // String
//        String str0 = "a";
//        String str1 = "ab";
//        String str2 = "abc";
//        String str3 = "abcde";
//        String[] strings = {str0, str1, str2, str3};
//        boolean isStringsSorted = isSorted(strings);
//        System.out.println(isStringsSorted);
//
//        // localDate
//        LocalDate localDate0 = LocalDate.EPOCH;
//        LocalDate localDate1 = LocalDate.now();
//        LocalDate localDate2 = LocalDate.of(2001,11,24);
//        LocalDate localDate3 = LocalDate.of(2001, 1, 26);
//        LocalDate[] localDates = {localDate0, localDate3, localDate2, localDate1};
//        boolean isLocalDatesSorted = isSorted(localDates);
//        System.out.println(isLocalDatesSorted);
        
        List<Integer> list = new ArrayList<>(List.of(99, 2, 1, 0, 15, 64, 74, 128, 8, 16, 36, 32, 10));
        ArrayList<Integer> arrayList = new ArrayList<>(13);
        arrayList.addAll(list);
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        System.out.println(isInstance(list));
        System.out.println(isInstance(treeMap));
        System.out.println(isInstance(hashMap));
//        Integer[] list = {1,6,8,2,10,6,3};
//        System.out.println(Arrays.toString(list));
//        sortIt(list);
//        System.out.println(Arrays.toString(list));

        System.out.println(arrayList);
        arrayList.removeIf(e -> e > 2);
        System.out.println(arrayList);

    }

    public static Function<String, String> sayHi = name ->
            "Hi " + name + ", nice to meet you";


    public static <T extends Comparable<T>> boolean isSorted(T[] tabOfT){
        boolean isSorted = true;
        for(int i = 0; i < tabOfT.length-1; i++){
            if (tabOfT[i].compareTo(tabOfT[i + 1]) > 0) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public static <T> boolean isInstance(T something){
        return something instanceof Map;
    }

    public static <T extends Comparable<T>> T[] sortIt(T[] list){
        Comparator<T> comparator = Comparator.naturalOrder();
        Arrays.sort(list, comparator);
        return list;
    }

}
