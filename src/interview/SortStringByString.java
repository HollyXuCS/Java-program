package interview;

import java.util.HashMap;

public class SortStringByString {

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
    /**
     * @param args
     * 
     * SquareInterview.sortBy("banana", "bac");
     *  SquareInterview.sortBy("abcaaccc", "bac");
     */
    public static void main(String[] args) {

    }

}
