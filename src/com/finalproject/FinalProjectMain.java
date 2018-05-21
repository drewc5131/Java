package com.finalproject;

import org.json.*;


import java.io.*;
import java.io.IOException;

public class FinalProjectMain {
    public static void main(String[] args){

        String jsonData = "";

        print("Loading file");
        try{
            FileReader reader = new FileReader("MassNames.json");

            JSONObject data = new JSONObject(reader);

            print("Finished Loading");
        }
         catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void print(String str){
        // hi i am lazy
        System.out.println(str);
    }
}
