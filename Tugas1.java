/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * Created by 21343035_Rayhan_Ahadi_Nifri
 */

/**
 *
 * @author rehan909090
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas1 {
    public static void main (String[] args){
        //enter word 1
        BufferedReader dataIn = new BufferedReader ( new InputStreamReader(System.in));
        String name = "";
        System.out.print ("Please enter your words 1 = ");
        
        try {
            name = dataIn.readLine();
        }
        
        catch (IOException e){
            System.out.println ("Error !");
        }
        
        //enter word 2
        BufferedReader dataMasuk = new BufferedReader (new InputStreamReader(System.in));
        String nama ="";
        System.out.print ("Please enter your words 2 = ");
        
        try{
            nama = dataMasuk.readLine();
        }
        
        catch(IOException e){
            System.out.println ("Error !");
        }

        //enter 3
        BufferedReader dataMasuak = new BufferedReader (new InputStreamReader(System.in));
        String namo ="";
        System.out.print("Please enter your words 3 = ");
        
        try{
            namo = dataMasuak.readLine();
        }
        
        catch(IOException e){
            System.out.println ("Error !");
        }
        
        System.out.println (name +" "+ nama +" "+ namo);
    }
}