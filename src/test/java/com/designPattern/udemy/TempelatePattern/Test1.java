package com.designPattern.udemy.TempelatePattern;

import com.designPattern.udemy.TemplatePattern.MergeSort;
import com.designPattern.udemy.TemplatePattern.Sort;

public class Test1 {

    public static void main(String[] args){

        Sort sort = new MergeSort(new int[]{787,323,132,13232,43432});

        sort.sort();

    }

}
