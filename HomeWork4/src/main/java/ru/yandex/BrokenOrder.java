package ru.yandex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class BrokenOrder {
    public static int countBrokenOrderV1(String line) {
        int[] array = Stream.of(line.split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();

        int count = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                count++;
            }
        }
        return count;
    }

    public static int countBrokenOrderV2(String line) {
        List<String> array = new ArrayList<>(List.of(line.split(" ")));
        List<Integer> arrayInt = new ArrayList<>();

        for (String s : array) {
            arrayInt.add(Integer.parseInt(s));
        }
        int count = 0;

        for (int i = 1; i < arrayInt.size(); i++) {
            if (arrayInt.get(i - 1) > arrayInt.get(i)) {
                count++;
            }
        }
        return count;

    }

    public static int countBrokenOrderV3(String line) {
        String[] arrayString = line.split(" ");
        int[] arrayInt = new int[arrayString.length];

        for (int i = 0; i < arrayString.length; i++) {
            arrayInt[i] = Integer.parseInt(arrayString[i]);
        }

        int count = 0;

        for (int i = 1; i < arrayInt.length; i++) {
            if (arrayInt[i - 1] > arrayInt[i]) {
                count++;
            }
        }
        return count;
    }

    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    public static long maxTwinMultiply(int[] array) {
        int max1 = array[0];
        int max2 = Integer.MIN_VALUE;

        for (int i = 1; i < array.length; i++) {
            if (max1 < array[i]) {
                max2 = max1;
                max1 = array[i];
            } else if (max2 < array[i] & max1 != array[i]) {
                max2 = array[i];
            }
        }
        return max1 * max2;
    }

    public static String rleCompress(String src) {
        Map<String ,Integer> map = new HashMap<>();
        while (src.length()!=0){
           char first =  src.charAt(0);
           map.put(String.valueOf(first),src.replaceAll("[^"+first+"]","").length());
           src = src.replaceAll(String.valueOf(src.charAt(0)),"").trim();
        }
        String result="";

        for(Map.Entry<String ,Integer> entry: map.entrySet()){
            result += String.format("%d(%s)",entry.getValue(),entry.getKey());

        }

            return result;
    }


}
