package interview;

import org.junit.Assert;
import org.junit.Test;

public class TestSortStringByString {
    
    /**
     * @param args
     * 
     * SquareInterview.sortBy("banana", "bac");
     *  SquareInterview.sortBy("abcaaccc", "bac");
     */

    @Test
    public void test() {
        Assert.assertEquals("banana", SortStringByString.SortStringByString("banana", ""));
        Assert.assertEquals("", SortStringByString.SortStringByString("", "bac"));
        Assert.assertEquals("baaann", SortStringByString.SortStringByString("banana", "bac"));
        Assert.assertEquals("banana", SortStringByString.SortStringByString("banana", "efg"));
        Assert.assertEquals("aaabnn", SortStringByString.SortStringByString("banana", "a"));
        Assert.assertEquals("bnnaaa", SortStringByString.SortStringByString("banana", "bn"));
        Assert.assertEquals("baaacccc", SortStringByString.SortStringByString("abcaaccc", "bac"));
    
        }

}
