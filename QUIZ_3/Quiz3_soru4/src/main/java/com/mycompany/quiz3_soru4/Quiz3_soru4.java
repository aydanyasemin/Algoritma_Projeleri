/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quiz3_soru4;

/**
 *
 * @author HP
 */
public class Quiz3_soru4 {

    public static void main(String[] args) {
        int rows = 5;
        
        printUcgen(rows);
    }
    
    public static void printUcgen(int rows){
        if(rows>0){
            printUcgen(rows-1);
            
            for(int i=0; i<(2*rows-1); i++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
}
