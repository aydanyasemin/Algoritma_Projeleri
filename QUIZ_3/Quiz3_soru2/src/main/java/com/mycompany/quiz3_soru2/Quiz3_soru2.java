/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quiz3_soru2;

/**
 *
 * @author HP
 */
public class Quiz3_soru2 {
    
    public static int BuyukSayiyiBul(int[] arr, int index){
        
        if(index == arr.length - 1 ){
            return arr[index];
        }else
        {
            int max = BuyukSayiyiBul(arr, index+1);
            return Math.max(arr[index], max);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,8,9,1,2,6,3,7,4,10};
        int max = arr.length;
        System.out.println("Dizideki En Büyük Sayı: " + max);
    }
}
