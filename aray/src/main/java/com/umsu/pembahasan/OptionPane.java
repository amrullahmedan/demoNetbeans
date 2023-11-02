/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umsu.pembahasan;

/**
 *
 * @author amrullahaam
 */

import javax.swing.JOptionPane;

public class OptionPane {
    public static void main(String[] args) {
//        String NmMhs = JOptionPane.showInputDialog("Masukkan Nama Anda:");
        String mhs = JOptionPane.showInputDialog("Masukkan Nama Mahasiswa: ");
        String AltMhs = JOptionPane.showInputDialog("Masukkan Alamat Anda:");
        
        System.out.println(mhs);
        System.out.println(AltMhs);
        
    }
}
