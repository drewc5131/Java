package com.finalproject;

import com.eclipsesource.json.JsonObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FinalProjectMain {
    public static void main(String[] args){
        GUIMain gui = new GUIMain();
        gui.Start();

        try (FileReader reader = new FileReader("planets.json")) {
        }
        catch (FileNotFoundException e){

        }
        JsonObject json = JsonObject.readFrom(data.);
    }
}
