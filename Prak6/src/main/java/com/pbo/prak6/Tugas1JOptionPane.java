/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.prak6;
import javax.swing.JOptionPane;

/**
 *
 * Created by Nazwa Nurfadhilla Phitri
 */
public class Tugas1JOptionPane {
    public static void main(String[]args){
        String x="";
        String y="";
        String z="";
        
        x=JOptionPane.showInputDialog("Masukkan Nilai Pertama");
        int pertama = Integer.valueOf(x).intValue();
        y=JOptionPane.showInputDialog("Masukkan Nilai Kedua");
        int kedua = Integer.valueOf(y).intValue();
        z=JOptionPane.showInputDialog("Masukkan Nilai Ketiga");
        int ketiga = Integer.valueOf(z).intValue();
        
        int rata_rata=(pertama+kedua+ketiga)/3;
        
        String hasil= "";
        hasil += "Nilai Pertama: " +pertama +"\n";
        hasil += "Nilai Kedua: " +kedua +"\n";
        hasil += "Nilai Ketiga: " +ketiga +"\n";
        hasil += "Rata-Rata Nilai Adalah " +rata_rata+"\n";
        
        if (rata_rata<=60){
        hasil +=":-("+"\n";
        }
        else {hasil +=":-)"+"\n";
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
     
