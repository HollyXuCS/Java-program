package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class SortStringByString {
    
    public static String SortStringUsingSort(String toSort, String sortBy) {
        final HashMap<Character, Integer> orderMap = new HashMap<Character, Integer>();
        int init = 1;
        for (char c : sortBy.toCharArray()) {
            orderMap.put(c, init++);
        }
        ArrayList<Character> ca = new ArrayList<Character>();
        for (char c : toSort.toCharArray()) {
            ca.add(c);
        }
        Collections.sort(ca, new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                Integer c1Order = (orderMap.get(c1) != null) ? orderMap.get(c1) : Integer.MAX_VALUE;
                Integer c2Order = (orderMap.get(c2) != null) ? orderMap.get(c2) : Integer.MAX_VALUE;
                System.out.println(c1 + "-" + c2 + "=" + (c1Order - c2Order));
                
                return c1Order - c2Order;
            }

        });
        //String s = String.valueOf(ca);
        StringBuffer sb = new StringBuffer();
        for (Character cc : ca) {
            sb.append(cc);
        }
        //System.out.println("sorted string: " + sb);
        return sb.toString();
    }

    public static String SortStringByString(String toSort, String sortBy) {
        if (sortBy == null || sortBy.isEmpty() || toSort == null || toSort.isEmpty())
            return toSort;
        
        StringBuffer remainStr = new StringBuffer();
        HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
        for (char ch : toSort.toCharArray()) {
            if (sortBy.indexOf(ch) >= 0) {
                if (countMap.containsKey(ch)) {
                   countMap.put(ch, countMap.get(ch) + 1);
                } else {
                    countMap.put(ch, 1);
                }
            } else {
                remainStr.append(ch);
            }
        }
        StringBuffer resultStr = new StringBuffer();
        for (char c : sortBy.toCharArray()) {
            if (countMap.containsKey(c)) {
                for (int i = 0; i < countMap.get(c); i++) {
                    resultStr.append(c);
                }
            }   
        }
        resultStr.append(remainStr);
        return resultStr.toString();
    }
    
    public static void main(String[] str) {
        char[] abc = new char[] {'c', 'b'};
        System.out.println(String.valueOf(abc));
    }
}
