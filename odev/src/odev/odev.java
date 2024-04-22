/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package odev;

public class odev {

    // öncelikle diziyi ikiye bölüyorum.
    public static void dizibol(int[] array) {
        if (array.length < 2) {
            return;
        }
        // ortasını buluyorum.
        int mid = array.length / 2;
        // yeniden ikiye bölme işlemi
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        // sol kısmını kopyaladım
        System.arraycopy(array, 0, left, 0, mid);
        // sağ kısmını kopyaladım
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }
        // sol kısmı sıralama
        dizibol(left);
        // sağ kısmını sıralama
        dizibol(right);
        // birleştirme
        merge(array, left, right);
    }

    // şimdi sıraladığım kısımları birleştiriyorum
    public static void merge(int[] array, int[] left, int[] right) {
        // sol ve sağın indisleri
        int i = 0;
        int j = 0;
        // birleştirilen indis
        int k = 0;
        while (i < left.length && j < right.length) {
            // sol eşit/küçükse dizinin sonuna
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            }
            // sağ daha küçükse dizinin sonuna
            else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        // soldaki kalanlar sizi sonuna
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }
        // sağdaki kalanlar dizi sonuna
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }
    
    public static void printArray(int[] array) {
        for (int dizi : array) {
            System.out.print(dizi + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Test dizisi
        int[] array = {6,51,15,27,9,36,48,3};
        // Diziyi sıralamadan önce yazdırma
        System.out.println("Dizinin baştaki hali");
        printArray(array);
        // Diziyi sıralama
        dizibol(array);
        // Diziyi sıraladıktan sonra yazdırma
        System.out.println("Dizinin sıralamalı hali");
        printArray(array);
    }
}

