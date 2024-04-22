/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soru1;

/**
 *
 * @author HP
 */

import java.util.Arrays;

public class SORU1 {

    public static void main(String[] args) {
       
        int[] birincidizi ={1,2,2,4,8,15,68,156,321};
        int[] ikincidizi = {4,9,9,23,66,956};
        
        int birinciuzunluk = birincidizi.length;
        int ikinciuzunluk = ikincidizi.length;
        
        int[] siralidizi = new int[birinciuzunluk+ikinciuzunluk];
        
        for(int i=0; i< birinciuzunluk+ikinciuzunluk; i++){
            if(i<birinciuzunluk)
                siralidizi[i] = birincidizi[i];
            else
                siralidizi[i] = ikincidizi[i-birinciuzunluk];
        }
        
        Arrays.sort(siralidizi,0,birinciuzunluk+ikinciuzunluk);
        System.out.println("birinci dizi = "+Arrays.toString(birincidizi));
        System.out.println("ikinci dizi = "+Arrays.toString(ikincidizi));
        System.out.println("sıralı dizi = "+Arrays.toString(siralidizi));
        
    }
    
}
