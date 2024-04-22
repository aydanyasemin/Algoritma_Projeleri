/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quiz3_soru3;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Quiz3_soru3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = sc.nextInt();
        
        System.out.println("Sayının tersi: " + TersSayi(sayi));
    }
    
    public static int TersSayi(int sayi){
        if(sayi <10){
            return sayi;
        }else {
            int sonSayi = sayi%10;
            int digerSayilar = sayi/10;
            int tersSayilar = TersSayi(digerSayilar);
            int Sayilar = (int) Math.log10(digerSayilar) +1;
            return sonSayi*(int) Math.pow(10,Sayilar) + tersSayilar;
        }
    }
}
