package com.bayamp.test;

import com.java.search.ArraySearch;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by naresh on 1/30/2016.
 */
public class TestCases {
    @Test
    public void searchTestUsingValidSearchName() {
        String[] items = {"ew", "wewe", "wre"};
        String inputString = "ew";
        boolean check = ArraySearch.stringContainsItemFromList(inputString, items);
        Assert.assertTrue(check, "The search failed. The item should have been present");
    }

    @Test
    public void searchTestUsingNull() {
        String[] items = {"ew", "wewe", "wre"};
        String inputString = null;
        boolean check = ArraySearch.stringContainsItemFromList(inputString, items);
        Assert.assertFalse(check, "The search failed. The item should have been present");
    }

    @Test
    public void searchTestUsingSpace() {
        String[] items = {"ew", "wewe", "wre"};
        String inputString = " ";
        boolean check = ArraySearch.stringContainsItemFromList(inputString, items);
        Assert.assertFalse(check, "The search failed. The item should have been present");
    }

    @Test
    public void searchflase() {
        String[] items = {"ew", "wewe", "wre"};
        String inputString = "ewwewe";
        boolean check = ArraySearch.stringContainsItemFromList(inputString, items);
        Assert.assertTrue(check, "The search failed. The item should have been present");
    }
}

