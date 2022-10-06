/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.prak6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/**
 *
 * Created by Nazwa Nurfadhilla Phitri
 */
public class Tugas1BufferedReader {
    public static void main (String[] args) {
        BufferedReader nilai = new BufferedReader(new InputStreamReader(System.in));
        String x="";
        String y="";
        String z="";
   
    try{
     System.out.print("Masukkan Nilai Pertama : ");
     x = nilai.readLine();
     System.out.print("Masukkan Nilai Kedua : ");
     y = nilai.readLine();
     System.out.print("Masukkan Nilai Ketiga : ");
     z = nilai.readLine();
    }catch(IOException e){
     System.out.println("Kata yang Anda masukkan salah, silahkan coba lagi.");
    }
    int pertama;
    int kedua;
    int ketiga;
    pertama = Integer.parseInt(x);
    kedua = Integer.parseInt(y);
    ketiga = Integer.parseInt(z);

    int rata_rata=(pertama+kedua+ketiga)/3;

    System.out.println("Rata-Rata Nilai : "+rata_rata);

     if (rata_rata<=60){System.out.println(":-(");
    }
    else {
     System.out.println(":-)");
    }
  }      
}
   