/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quiz3_soru1;

/**
 *
 * @author HP
 */
public class Quiz3_soru1 {

    public static int FarkiBul(int[] arr, int n) {
        
        if(n == 1)
        {
            return 0;
        }
        
        int max = arr[0];
        int min = arr[0];
        
        for (int i = 1; i<n; i++)
        {
         if(arr[i] > max)
         {
             max = arr[i];
         }   
         if(arr[i] < min)
         {
            min = arr[i];
         }
        }
        
        return max - min;
    }
    
    public static void main (String[] args){
        
        int[] arr = {4,7,9,1,3,2,8,10,6,5};
        int n = arr.length ;
        int fark = FarkiBul(arr,n);
        System.out.println("En büyük ve en küçük sayı arasındaki fark: " + fark);
    }
}
