/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soru_1;

/**
 *
 * @author HP
 */
import java.util.Arrays;

public class SORU_1 {
    
    public static void main(String[] args) {
        int []dizi = {1,5,-4,7,8,-6};
        int num1 =0, num2=0;
        int minSum = Integer.MAX_VALUE;
        Arrays.sort(dizi);
        
        for (int i=0; i<dizi.length; i++){
            for(int j = i+1; j<dizi.length; j++){
                int toplam = dizi[i]+dizi[j];
                int fark = Math.abs(toplam);
                
                if(fark<minSum){
                    minSum = fark;
                    num1 = dizi[i];
                    num2 = dizi[j];
                }
            }
        }
        System.out.println("Toplamları sıfıra yakın iki sayı"+num1+"ve"+num2);
    }
}
