package com.lptree.utils.Test;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class TestArrayList {
    public static void main(String[] args) {
        List<String> a= new ArrayList();
        a.add("aaaa");


        System.out.println(a.get(0));
        //SubList<String> subList = a.subList(0,5);
    }
}
