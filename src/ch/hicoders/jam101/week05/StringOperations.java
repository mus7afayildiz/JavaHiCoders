package ch.hicoders.jam101.week05;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        upperCase();
        sayilar();
        asalSayilar();
        sifre();
        piramid();


    }

    public static void upperCase(){
        /*  1)  Verilen bir isim ve soyismin sadece bas harflerini Uppercase a cevirin.
         ornek: asik veysel ==> Asik Veysel*/

        System.out.println("Odev1 : Verilen bir isim ve soyismin sadece bas harflerini Uppercase a cevirin.");
        System.out.println("Bir isim giriniz :");
        Scanner scan = new Scanner(System.in);
        String ad = scan.next();
        System.out.println("Bir soyad giriniz :");
        String soyad = scan.next();
        String nameWithUpperCase = ad.toUpperCase().substring(0,1)+ad.substring(1,ad.length())+" "+soyad.toUpperCase().substring(0,1)+soyad.substring(1,soyad.length());
        System.out.println("Son Hali : " + nameWithUpperCase);
        System.out.println();
    }

    public static void sayilar(){
        /*  2)  0 dan 100 e kadar olan sayilari, bir satirda 10 sayi ve her sayinin arasinda virgul olacak sekilde yazdiriniz*/
        /* 0 dan baslayip 100 e kadar 101 sayi oldugu icin son satira tek 100 sayisi kaliyor*/

        System.out.println("Odev2 : 0 dan 100 e kadar olan sayilari, bir satirda 10 sayi ve her sayinin arasinda virgul olacak sekilde yazdiriniz");
        for(int i=0; i<=100; i++){
            if(i%10==0){
                System.out.println();
            }
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println();
    }


    public static void asalSayilar(){
        /* 3)  0 dan 100 e kadar olan prime (asal sayilari) yatay olarak yazdirin (Asal sayilar: sadece kendisine ve 1 e bolunebilen sayilar)
         bulunmasi gereken sonuc: 1, 2, 3, 5, 7, 11 ....*/

        // 1 asal sayi degildir!!!
        System.out.println("Odev3 : "+"0 dan 100 e kadar olan prime (asal sayilari) yatay olarak yazdirin");
        System.out.println("En kucuk asal sayi 2 dir.");
        int count = 0;
        for(int i=2; i<=100;i++){
            for(int j=2;j<i;j++){
                if(i%j == 0){
                    count = 1;
                }
            }
            if(count == 0){
                System.out.print(i+",");
            }else{
                count = 0;
            }
        }
        System.out.println();
        System.out.println();
    }

        public static void sifre(){
        /* 4)  Kucuk, buyuk, ozel karakterler ve sayilardan olusan 8 ile 16 (hane) uzunluklari arasinda guvenli 50 adet sifre olusturunuz. */
            System.out.println("Odev4 : "+"Kucuk, buyuk, ozel karakterler ve sayilardan olusan 8 ile 16 (hane) uzunluklari arasinda guvenli 50 adet sifre olusturunuz.");
            Random random = new Random();
            String sifreKarakterleri= "qwertzuiopasdfghjklyxcvbnm.,-!?()&/ç%*+";
            String sifre = null;
            for(int i=0; i<50; i++){
                int x = random.nextInt(30);
                    sifre = sifreKarakterleri.substring(x, x + 3) + random.nextInt(90000000) + sifreKarakterleri.substring(x + 2, x + 6);
                System.out.println("Sifre"+(i+1)+" :"+sifre);
            }
            System.out.println();
        }

        public static void piramid(){
        /* 5)  Asagidaki sekli programlama yapilarini kullanarak cizdiriniz.



                       *
                       **
                       ***
                       ****
                       *****
                       ******  */
            System.out.println("Odev5 :"+"Asagidaki sekli programlama yapilarini kullanarak cizdiriniz.");
            for(int i=6;i>0;i--){
                for(int j=i; j<7; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }