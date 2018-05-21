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
            Scanner fileLoader = new Scanner("MassNames.json");

            String jsonString = fileLoader.nextLine();
            print(jsonString);

            JSONArray arr = new JSONArray(jsonString);

            JSONArray nameArray = arr.getJSONArray(1);


            JSONObject firstnameTest = nameArray.getJSONObject(0);

            print(firstnameTest.getString("Name"));




    }

    public static void print(String str){
        // hi i am lazy
        System.out.println(str);
    }
}
