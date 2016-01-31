package com.bayamp.test2;

import com.java.Array.Palindrome;
import com.java.search.ArraySearch;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by naresh on 1/30/2016.
 */
public class PalindromeTest {
    @Test
    public void chkPlaindromeforNull() {
        String name = " ";
        boolean check = Palindrome.isPalindrome(name);
        Assert.assertTrue(check, "The search failed. The item should have been present");
    }

    @Test
    public void chkPlaindromeforPlaindrome() {
        String name = "abba";
        boolean check = Palindrome.isPalindrome(name);
        Assert.assertTrue(check, "The search failed. The item should have been present");
    }

    @Test
        public void chkPlaindromeforNotPlaindrome() {
        String name = "asdf";
        boolean check = Palindrome.isPalindrome(name);
        Assert.assertFalse(check, "The search failed. The item should have been present");
    }

    @Test
            public void chkPlaindromeNull() {
                String name = "";
                boolean check = Palindrome.isPalindrome(name);
                Assert.assertTrue(check, "The search failed. The item should have been present");
}

}
