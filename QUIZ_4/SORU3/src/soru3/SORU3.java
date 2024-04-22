/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soru3;

/**
 *
 * @author HP
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SORU3 {

    public static void main(String[] args) {
        String sehirListesiDosyasi = "sehir listesi.txt";
        String plakaListesiDosyasi = "plaka listesi.txt";

        try (FileReader FR = new FileReader(sehirListesiDosyasi);
             BufferedReader BR = new BufferedReader(FR);
             FileWriter FW = new FileWriter(plakaListesiDosyasi)) {

            String sehir;
            while ((sehir = BR.readLine()) != null) {
                FW.write(sehir);
            }

            System.out.println("Şehir listesi plaka listesine aktarıldı.");

        } catch (IOException e) {
            System.err.println("HATA! " + e.getMessage());
        }
    }
}

