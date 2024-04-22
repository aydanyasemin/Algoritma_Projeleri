/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soru_3;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class SORU_3 {

    public static void main(String[] args){
        String cumle = "Gaziosmanpaşa Üniversitesi Bilgisayar Mühendisliği";
        String[] kelimeler = Kelimeler(cumle);
        System.out.println(Arrays.toString(kelimeler));
    }
    
    public static String[] Kelimeler(String cumle) {
        String[] kelimeler = cumle.split(" ");
        return kelimeler;
    }
}
