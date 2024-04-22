/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mayin_tarlasi;

/**
 *
 * @author HP
 */
import java.util.Random;
import java.util.Scanner;
public class Mayin_tarlasi {

    public static void main(String[] args) {
          System.out.print("Satır Büyüklüğünü Giriniz : ");
        int satir;
        Scanner deger = new Scanner(System.in);
        satir = deger.nextInt();
        System.out.print("Sütun Büyüklüğünü Giriniz : ");
        int sutun;
        sutun = deger.nextInt();
        System.out.println();
        
        for (int i = 0; i < satir; i++) 
        {
            for (int j = 0; j < sutun; j++) 
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        
        int zorlukderecesi, mayinsatir, mayinsutun, mayinsayisi;
        int [][] mayinliyerler = new int [satir][sutun];
        
        System.out.print("Lütfen 20 İle 80 Arasında Zorluk Derecesini Giriniz : ");
        
        while(true)
        {
            zorlukderecesi = deger.nextInt();
            if(!(zorlukderecesi >= 20 && zorlukderecesi <= 80))
            {
                System.out.println("Lütfen İstenilen Aralıkta Zorluk Derecesi Giriniz !");
                System.out.print("Şimdi 20 İle 80 Arasında Olacak Şekilde Oyunun Zorluk Derecesini Giriniz : ");
                continue;
            }
            else
            {
                double z = zorlukderecesi * 0.01;
                mayinsayisi = (int) (satir * sutun * z);
            }
            break;
        }
        
        Random uret = new Random();
        for (int i = 0; i < mayinsayisi; i++) 
        {
            mayinsatir = uret.nextInt(satir);
            mayinsutun = uret.nextInt(sutun);
            mayinliyerler[mayinsatir][mayinsutun] = 1;
        }
        
        for (int i = 0; i < satir; i++) 
        {
            for (int j = 0; j < sutun; j++) 
            {
                if(mayinliyerler[i][j] != 1)
                {
                    mayinliyerler[i][j] = 0;
                }
            }
        }
        System.out.println("Mayınlar Yerleştirildi! ");
        System.out.println();
        
        for (int i = 0; i < satir; i++) 
        {
            for (int j = 0; j < sutun; j++) 
            {
                System.out.print( " * ");               
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("BAŞLAYABİLİRSİNİZ");
        int puan = 0;
        String [][] mayinlibölge = new String[satir][sutun];
        for (int i = 0; i < satir; i++) 
        {
            for (int j = 0; j < sutun; j++) 
            {
                mayinlibölge [i][j] = " * ";
            }
        }
        
            while(true)
            {
                System.out.println();
                System.out.print("Oyunun Satır Değerini Giriniz : ");
                int sa = deger.nextInt();
                if(sa == satir || sa > satir)
                {
                    System.out.println("Girmiş Olduğunuz Değer Satır Boyutu İle Eşdeğer Ya Da Büyük Olmamalı Lütfen Farklı Bir Değer Giriniz.");
                    continue;
                }
                
                System.out.print("Oyunun Sütun Değerini Giriniz : " );
                int su = deger.nextInt();
                if(su == sutun || su > sutun)
                {
                    System.out.println("Girmiş Olduğunuz Değer Sütun Boyutu İle Eşdeğer Ya Da Büyük Olmamalı Lütfen Farklı Bir Değer Giriniz.");
                    continue;
                }
                System.out.println();
                
                if(mayinliyerler[sa][su] == 1)
                {
                    System.out.println("OYUN SONA ERDİ");
                    System.out.println("Kazanmış Olduğunuz Toplam Puanınız : " + puan + "\n");
                 
                    for (int i = 0; i < satir; i++) 
                    {
                        for (int j = 0; j < sutun; j++) 
                        {
                            System.out.print(mayinliyerler[i][j] + "  ");
                        }
                        System.out.println("  ");
                    }
                    break;
                }
                else
                {
                    mayinlibölge [sa][su] = " 0 ";
                    puan += 5;
                    for (int i = 0; i < satir; i++) 
                    {
                        for (int j = 0; j < sutun; j++) 
                        {
                            System.out.print(mayinlibölge [i][j] + "");
                        }
                        System.out.println("  ");
                    }
                }
            }
    }
}
