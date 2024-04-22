/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soru2;

/**
 *
 * @author HP
 */

import java.util.Arrays;
import java.util.Random;

public class SORU2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] rndmsayi = randomSayilar(100);
        int[] dortsayi = enKucukDortSayiyiBul(rndmsayi);
        
        System.out.println("En Küçük Dört Sayılar = "+Arrays.toString((dortsayi)));
    }
    
    public static int[] enKucukDortSayiyiBul(int[] dizi){
        int[] kucukdort = new int[4];
        Arrays.fill(kucukdort, Integer.MAX_VALUE);
        
        for(int sayi : dizi) {
            if(sayi<kucukdort[3]){
                kucukdort[3] = sayi;
                Arrays.sort(kucukdort);
            }
        }
        
        return kucukdort;
    }
    
    public static int[] randomSayilar(int adet){
        int[] rndmsayi = new int[adet];
        Random rndm = new Random();
        
        for(int i=0; i<adet; i++){
            rndmsayi[i] = rndm.nextInt(1000);
        }
        
        return rndmsayi;
    }
    
}
