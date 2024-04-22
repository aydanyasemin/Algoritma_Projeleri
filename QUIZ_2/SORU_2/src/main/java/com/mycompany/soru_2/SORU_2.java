/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soru_2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SORU_2 {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.print("Üretilecek sayı miktarını yazınız: " );
       int n = input.nextInt();
       
       Random rndm = new Random();
       int[] sayilar = new int[10];
       int maxSayi = 0;
       
       for(int i = 0; i< n; i++){
           int sayi = rndm.nextInt(10) +1 ;
           sayilar [sayi-1]++;
           if(sayilar[sayi-1] > sayilar[maxSayi]){
               maxSayi = sayi -1;
           }
       }
       
       System.out.println ("Sayılar ve kaç kere üretildikleri; ");
       for (int i =0; i<10; i++){
           System.out.println((i+1) + ": " + sayilar[i]);
       }
       
       System.out.println("En çok üretilen sayı: " + (maxSayi+1));
    }
}
