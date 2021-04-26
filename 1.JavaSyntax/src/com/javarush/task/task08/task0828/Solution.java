package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        list.add("January is the 1 month");
        list.add("February is the 2 month");
        list.add("March is the 3 month");
        list.add("April is the 4 month");
        list.add("May is the 5 month");
        list.add("June is the 6 month");
        list.add("July is the 7 month");
        list.add("August is the 8 month");
        list.add("September is the 9 month");
        list.add("October is the 10 month");
        list.add("November is the 11 month");
        list.add("December is the 12 month");

        String s = reader.readLine();
        int temp = 0;

        for (int i = 0; i < list.size(); i++) {
          String str = list.get(i);
          if(str.contains(s)){
              temp = i;
          }
        }
        System.out.println(list.get(temp));
    }
}
