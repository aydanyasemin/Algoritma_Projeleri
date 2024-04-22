/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritma_ıı_final_projesi;

/**
 *
 * @author HP
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Algoritma_II_final_projesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secim;
        do {
            System.out.println("Algoritma ve Programlama II Final Projesi");
            System.out.println("1. Soru: txt dosyasını oku");
            System.out.println("2. Soru: Dosyadaki sayıları say");
            System.out.println("3. Soru: Büyükleri mavi, küçükleri sarı yazdır");
            System.out.println("4. Soru: Sayıları değiştir ve ikiliDosya.txt'ye yaz");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminizi yapınız: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 0:
                    System.out.println("İşlem bitmiştir!");
                    break;
                case 1:
                    soru1();
                    secim = menuyeDon();
                    break;
                case 2:
                    soru2();
                    secim = menuyeDon();
                    break;
                case 3:
                    soru3();
                    secim = menuyeDon();
                    break;
                case 4:
                    soru4();
                    secim = menuyeDon();
                    break;
                default:
                    System.out.println("Geçersiz seçim. Tekrar deneyin.");
                    break;
            }
        } while (secim != 0);

        System.out.println("Kapandı.");
    }
    
     public static void soru1() {
        String dosyaYolu = Paths.get("").toAbsolutePath().toString() + "/bilgi.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(dosyaYolu))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }
    }

    public static void soru2() {
        Map<Integer, Integer> sayilar = new HashMap<>();
        String dosyaYolu = Paths.get("").toAbsolutePath().toString() + "/bilgi.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(dosyaYolu))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] sayiDizisi = line.trim().split("\\s+");
                for (String sayiStr : sayiDizisi) {
                    try {
                        int sayi = Integer.parseInt(sayiStr);
                        int sayac = sayilar.getOrDefault(sayi, 0);
                        sayilar.put(sayi, sayac + 1);
                    } catch (NumberFormatException e) {
                        // Geçersiz sayı formatını atla veya hata işleme mekanizması ekle
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
            return;
        }

        for (Map.Entry<Integer, Integer> entry : sayilar.entrySet()) {
            int sayi = entry.getKey();
            int adet = entry.getValue();
            System.out.println(sayi + " -> " + adet);
        }
    }

    public static void soru3() {
    String dosyaYolu = Paths.get("").toAbsolutePath().toString() + "/bilgi.txt";
    try (BufferedReader reader = new BufferedReader(new FileReader(dosyaYolu))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] sayiDizisi = line.trim().split("\\s+");
            for (String sayiStr : sayiDizisi) {
                try {
                    String trimmedSayiStr = sayiStr.trim(); // Ekstra boşlukları temizle
                    int sayi = Integer.parseInt(trimmedSayiStr);
                    if (sayi > 0) {
                        System.out.print("\u001B[44m"); // Mavi arka plan rengi
                    } else {
                        System.out.print("\u001B[43m"); // Sarı arka plan rengi
                    }
                    System.out.println(sayi);
                } catch (NumberFormatException e) {
                    // Geçersiz sayı formatını atla veya hata işleme mekanizması ekle
                }
            }
        }
    } catch (IOException e) {
        System.out.println("Dosya okuma hatası: " + e.getMessage());
    }
}

    public static void soru4() {
        String dosyaYolu = Paths.get("").toAbsolutePath().toString() + "/bilgi.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(dosyaYolu));
             BufferedWriter writer = new BufferedWriter(new FileWriter("ikiliDosya.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] sayiDizisi = line.trim().split("\\s+");
                for (String sayiStr : sayiDizisi) {
                    try {
                        String trimmedSayiStr = sayiStr.trim(); // Ekstra boşlukları temizle
                        int sayi = Integer.parseInt(trimmedSayiStr);
                        if (sayi >= 0 && sayi <= 10) {
                            sayi = 0;
                        } else if (sayi >= 11 && sayi <= 255) {
                            sayi = 1;
                        }
                        writer.write(String.valueOf(sayi));
                        writer.newLine();
                    } catch (NumberFormatException e) {
                        // Geçersiz sayı formatını atla veya hata işleme mekanizması ekle
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Dosya işleme hatası: " + e.getMessage());
        }
    }

    public static int menuyeDon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üst menüye dönmek için 5'e, çıkış için 0'a basınız");
        System.out.print("Seçiminizi yapınız: ");
        return scanner.nextInt();
    }

}
