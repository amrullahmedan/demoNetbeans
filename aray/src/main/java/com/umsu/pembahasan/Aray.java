/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.umsu.pembahasan;


 import java.util.Scanner;

public class Aray {

    public static void main(String[] args) {
        
       
//        String [] teks = {"Annis","Ganjar","Prabowo","Jokowi"};
//        System.out.println("Isi Arai = " + teks);
//            for (int i = 0; i < teks.length; i++) {
//                System.out.println("isi arainya adalah " + teks[i]);
//        }
        String [] Nm_Mhs = new String[4];
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < Nm_Mhs.length; i++) {
            System.out.print("Nama Capres ke " + i  +" : ");
            Nm_Mhs[i] =   scan.nextLine();
            
        }       
       for (String mahasiswa : Nm_Mhs) {
           System.out.println("####=======================###");       
           System.out.println(mahasiswa);
        }         
    }
}
    
