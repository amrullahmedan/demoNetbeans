/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umsu.pertemuan01;


import java.util.Scanner;

public class OperatorAritmatika {


    public static void main(String[] args) {
        int Nilai1;
        int Nilai2;
        int hasil;

        Scanner keyboard = new Scanner(System.in);
//
//        ARITMATIKA
//        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 =keyboard.nextInt();
////
//        // penjumlahan
        hasil = Nilai1 + Nilai2;
        System.out.println("Hasil = " + hasil);
//
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
////
        // pengurangan
        hasil = Nilai1 - Nilai2;
        System.out.println("Hasil = " + hasil);
//
         System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
////
//        // perkalian
        hasil = Nilai1 * Nilai2;
        System.out.println("Hasil = " + hasil);
//
//
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
//
//        // Pembagian
        hasil = Nilai1 / Nilai2;
        System.out.println("Hasil = " + hasil);
//
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();

        // Sisa Bagi
        hasil = Nilai1 % Nilai2;
        System.out.println("Hasil = " + hasil);
//        
//        
////        OPERATOR PENUGASAN
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
//        System.out.print("Input angka-2: ");
//        Nilai2 = keyboard.nextInt();
//        // Penugasan dan pengurangan
        hasil = Nilai1;
        System.out.println("Hasil = " + hasil);
//
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
//        // Pengisian dan penambahan
        hasil = Nilai1 += Nilai2;
        System.out.println("Hasil += " + hasil);
//        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        // Pengisian dan penambahan
        hasil = Nilai1 -= Nilai2;
        System.out.println("Hasil -= " + hasil);
//        
//        
//        
        


//        OPERATOR PEMBANDING



//      OPERATOR BITWISE
        int nilai3, nilai4, hasil1;
        boolean hasil3;
        
        System.out.print("Input angka-1: ");
        nilai3 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        nilai4 = keyboard.nextInt();
        //  fungsi AND
        hasil1 = nilai3 & nilai4;
        System.out.println("Hasil & =" + hasil1);
       
        System.out.print("Input angka-1: ");
        nilai3 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        nilai4 = keyboard.nextInt();
        //  fungsi OR
         hasil1 = nilai3 | nilai4;
        System.out.println("Hasil | =" + hasil1);
        
        System.out.print("Input angka-1: ");
        nilai3 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        nilai4 = keyboard.nextInt();
        //  fungsi XOR
         hasil1 = nilai3 ^ nilai4;
        System.out.println("Hasil ^ =" + hasil1);
        
        
        System.out.print("Input angka-2: ");
        nilai4 = keyboard.nextInt();
        //  fungsi NEGASI
         hasil1= ~nilai4;
        System.out.println("Hasil ^ =" + hasil1);
        
        System.out.print("Input angka-1: ");
        nilai3 = keyboard.nextInt();  
        //  fungsi left Shift
         hasil1 = nilai3 << 3;
        System.out.println("Hasil ^ =" + hasil1);
        
        System.out.print("Input angka-1: ");
        nilai3 = keyboard.nextInt();  
        //  fungsi Right Shift
         hasil1 = nilai3 >> 4;
        System.out.println("Hasil Right Shift");
        System.out.println("Hasil ^ = " + hasil1);

    }
}
