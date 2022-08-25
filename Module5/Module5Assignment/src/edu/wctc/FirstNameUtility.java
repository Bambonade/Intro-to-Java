package edu.wctc;

import java.util.Map;

public class FirstNameUtility {
    private Map<String, Integer> firstNameCodeMap;
    private Map<String, Integer> firstInitialCodeMap;
    private Map<String, Integer> middleInitialCodeMap;

    public FirstNameUtility(Map<String, Integer> firstNameCodeMap, Map<String, Integer> firstInitialCodeMap, Map<String, Integer> middleInitialCodeMap) {
        this.firstNameCodeMap = firstNameCodeMap;
        this.firstInitialCodeMap = firstInitialCodeMap;
        this.middleInitialCodeMap = middleInitialCodeMap;
    }
}
