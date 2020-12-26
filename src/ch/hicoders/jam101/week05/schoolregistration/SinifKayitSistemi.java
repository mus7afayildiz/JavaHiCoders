package ch.hicoders.jam101.week05.schoolregistration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinifKayitSistemi{

    static String name, surname, okulNumarasi, okulBilgisi;
    static int age;
    static List<String> sinif1 = new ArrayList<>();
    static List<String> sinif2 = new ArrayList<>();
    static List<String> sinif3 = new ArrayList<>();
    static List<String> sinif4 = new ArrayList<>();
    static List<String> sinif5 = new ArrayList<>();
    static List<List<String>> okul = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ogrenciKaydi();
        System.out.println(okul);
    }

    public static void ogrenciKaydi() {

        for (int i = 0; i < 10; i++) {
            System.out.println("6 ile 10 yas araliginda Toplam 10 ogrenci bilgisi giriniz");
            System.out.println((10-i)+" Ogrenci bilgisi daha giriniz");
            System.out.println();
            System.out.println("Ogrencinin ismini giriniz : ");
            name = scan.next();
            System.out.println("Ogrencinin Soyadini giriniz : ");
            surname = scan.next();
            System.out.println("Ogrencinin yasini giriniz : ");
            age = scan.nextInt();
            okulNo();
            sinifaEkleme();
            System.out.println("sinif1 :"+sinif1);
            System.out.println("sinif2 :"+sinif2);
            System.out.println("sinif3 :"+sinif3);
            System.out.println("sinif4 :"+sinif4);
            System.out.println("sinif5 :"+sinif5);
        }
    }
        public static void okulNo () {
            okulNumarasi = name.substring(0, 2) + surname.substring(surname.length() - 3) + age;
            System.out.println(okulNumarasi.toUpperCase());
        }

        public static void sinifaEkleme () {
            okulBilgisi = name+" "+surname+" --> "+okulNumarasi + "," + name + " " + surname.toUpperCase();
        if(age<6){
            System.out.println("Hatali giris yaptiniz yasi 6 dan kucuk");
        }else if(age==6){
            sinif1.add(okulBilgisi);
        }else if(age==7){
            sinif2.add(okulBilgisi);
        }else if(age==8){
            sinif3.add(okulBilgisi);
        }else if(age==9){
            sinif4.add(okulBilgisi);
        }else if(age==10){
            sinif5.add(okulBilgisi);
        }else{
            System.out.println("Hatali giris yaptiniz");
        }
        okul.add(sinif1);
        okul.add(sinif2);
        okul.add(sinif3);
        okul.add(sinif4);
        okul.add(sinif5);
            System.out.println(okul);
    }
}