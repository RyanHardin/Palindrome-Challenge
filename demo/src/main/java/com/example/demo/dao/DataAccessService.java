package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("Dao")
public class DataAccessService implements PersonDao {

    private static List<Person> DB = new ArrayList<>();

    @Override
    public List<Person> insertPerson(String name){

        String temp = name.replaceAll("\\s+", "");
        Set<String> set = new HashSet<>();

        //Traverse the string calling the expand method for each character
        for (int i = 0; i < name.length(); i++)
        {
            // find all odd length palindrome with str[i] as mid point
            stretch(temp, i, i, set);
            // find all even length palindrome with str[i] and str[i+1] as its mid points
            stretch(temp, i,i + 1, set);
        }

        // print list of all palindromic substrings
        System.out.println(set);

        DB.add(new Person(set.size(), name));

        return DB;
    }

    // stretch the string in both directions of low and high to find all palindromes
    // adding each to the set
    public static void stretch(String pal, int min, int max, Set<String> set)
    {
        while (min >= 0 && max < pal.length() && pal.charAt(min) == pal.charAt(max))
        {
            // push palindromes into the list
            set.add(pal.substring(min, max + 1));
            // expand subString in both directions
            min--;
            max++;
        }
    }

}
