package com.finalproject;

import org.json.*;


import java.io.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FinalProjectMain {
    public static void main(String[] args){

        String jsonData = "";

        print("Loading file");
        Scanner fileLoader = null;
        try {
            fileLoader = new Scanner(new File("MassNames2001-min.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        JSONObject allNames = new JSONObject(fileLoader.nextLine());
        print("Loaded file!");

        JSONObject firstnameTest = allNames.getJSONObject("Jeffery");


        print(Integer.toString(firstnameTest.getInt("Occurrences")));




    }

    public static void print(String str){
        // hi i am lazy
        System.out.println(str);
    }
}
