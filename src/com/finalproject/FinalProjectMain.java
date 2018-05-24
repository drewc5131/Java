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

        Scanner input = new Scanner(System.in);
        try {
            String name = input.nextLine();
            JSONArray firstnameTest = allNames.getJSONArray(name);
            int howManyGenders = firstnameTest.length();
            for (int i = 0; i < howManyGenders; i++) {

                JSONObject nameData = firstnameTest.getJSONObject(i);
                print("The Name " + name + " For the gender " + nameData.getString("Sex") + " Occurs " +
                        Integer.toString(nameData.getInt("Occurrences")) + " Times");
            }

        }
        catch (JSONException e){
            e.printStackTrace();
        }





    }

    public static void print(String str){
        // hi i am lazy
        System.out.println(str);
    }
}
