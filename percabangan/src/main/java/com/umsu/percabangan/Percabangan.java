/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.umsu.percabangan;

/**
 *
 * @author amrullahaam
 */

import java.util.Scanner;

public class Percabangan {

    public static void main(String[] args) {
        double UAS  ;
        String Nama;
        
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Input Nama = "); Nama = scan.nextLine();
        System.out.print("Nilai UAS = "); UAS = scan.nextInt();

        // cek apakah nilai >= 70
        if ( UAS >= 70 ) {
            System.out.println("Selamat " + Nama + "  " + UAS + " Anda Lulus" );
        }else{
            
            System.out.println("Mohon maaf " + Nama + "  " + UAS + " Anda Tidak Lulus" );
        }

        
    }
}
