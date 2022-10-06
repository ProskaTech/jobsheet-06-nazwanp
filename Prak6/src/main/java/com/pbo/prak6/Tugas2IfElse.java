/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.prak6;
import java.util.Scanner;

/**
 *
 * Created by Nazwa Nurfadhilla Phitri
 */
public class Tugas2IfElse {
    public static void main(String[]args){
        String angka="";
        angka=JOptionPane.showInputDialog("Silahkan Masukkan Angka ");
        int x = Integer.valueOf(angka).intValue();
        
        String hasil ="";
        if (x>=1&&x<=10){
         hasil += "Valid number";
        }
        else{
         hasil += "Invalid Number";
        }
       JOptionPane.showMessageDialog(null, hasil);
        }
}

