/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * Created by 21343035_Rayhan_Ahadi_Nifri
 */

/**
 *
 * @author rehan909090
 */


import javax.swing.JOptionPane;

public class Tugas2 {
    public static void main (String[] args){
	//input OptionPane1
	String name = "";
	name = JOptionPane.showInputDialog("Please enter your words 1#");
	
	//input OptionPane2
	String nama = "";
	nama = JOptionPane.showInputDialog("Please enter your words 2#");
	
	//input OptionPane3
	String namo = "";
	namo = JOptionPane.showInputDialog("Please enter your words 3#");
	
	String msg = name +" "+ nama +" "+ namo ;
	JOptionPane.showMessageDialog(null, msg);
        
        System.out.println (name +" "+ nama +" "+ namo);
    }	
}
