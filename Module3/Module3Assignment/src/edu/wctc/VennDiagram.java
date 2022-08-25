package edu.wctc;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class VennDiagram<T> {
    String carby;
    String tomatoey;
    String cheesy;
    Set<T> category1;
    Set<T> category2;
    Set<T> category3;
    public VennDiagram(String str1, String str2, String str3) {
        this.carby = str1;
        this.tomatoey = str2;
        this.cheesy = str3;
        category1 = new HashSet<>();
        category2 = new HashSet<>();
        category3 = new HashSet<>();
    }
private <T> String getCircleForLable(String label){
        return category1.toString();
    }
/*
    public <T> void add(T item, String label1, String label2, String label3) {

    }

    public <T> String unionOf(String str1, String str2) {
        Set<String> carbyOrTomatoey = new HashSet<>();
        carbyOrTomatoey.addAll();
        return carbyOrTomatoey.toString();
    }

    public <T> String intersectionOf(String str1, String str2) {
        Set<String> cheeseyAndTomatoey = new HashSet<>();
        cheeseyAndTomatoey.retainAll();
        return cheeseyAndTomatoey.toString();

    }

    public <T> String complementOf(String str1, String str2) {
        Set<String> cheeseyButNotCarby = new HashSet<>();
        cheeseyButNotCarby.removeAll();
        return cheeseyButNotCarby.toString();
    }

    public <T> String diagramCenter() {
        Set<String> allThree = new HashSet<>();
        allThree.retainAll();
        allThree.retainAll();
        return allThree.toString();
    }
 */
}
