package ch.hicoders.jam101.week04;

import java.util.Random;
import java.util.Scanner;

public class Kod {

    Random vagon = new Random();

    static int tahminEdilenVagon, count=1; // 2.Kullanici maximum 4 denemede suphelinin oldugu vagonu tahmin etmesi gerekecektir.
    //1. 1-10 arası rastgele vagon numarası uretılır ve supheli bu vagonda saklanir.

    private int suphelininSaklandigiVagon = vagon.nextInt(9)+1;

    public int getSuphelininSaklandigiVagon() {
        return suphelininSaklandigiVagon+1;
    }


    public void supheli(){
        System.out.println("suphelinin vagon : " + (suphelininSaklandigiVagon +1));
    }

    public void start(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Suphelinin oldugu vagonu tahmin etmek icin 1-10 arasi bir vagon numrasi giriniz");
        tahminEdilenVagon = scan.nextInt();
        /* System.out.println("tah :" + tahminEdilenVagon);
        System.out.println("sp : " +getSuphelininSaklandigiVagon());*/
    }

    public void karsilastirma(){
        // 2.Kullanici maximum 4 denemede suphelinin oldugu vagonu tahmin etmesi gerekecektir.
        for(int i=0; i<6; i++) {
             if(tahminEdilenVagon<=0||tahminEdilenVagon>10){
                System.out.println("Hatali giris yaptiniz");
                start();
                count++;// 2.Kullanici maximum 4 denemede suphelinin oldugu vagonu tahmin etmesi gerekecektir.
            }
            if (tahminEdilenVagon == getSuphelininSaklandigiVagon()) {
                System.out.println("Tebrikler supheliyi yakaladiniz");
                System.out.println("Tesekkurler");
                puan();
                break;

            }else if(tahminEdilenVagon<getSuphelininSaklandigiVagon()){
                //3.  Kullanıcıya 'ön vagonda' veya 'arka vagonda' ifadeleri ile yonlendirme yapılarak hangi vagonda oldugunu daha kolay bulmasına yardım edilecektir.
                System.out.println("Arka vagonda");
                start();
                count++;// 2.Kullanici maximum 4 denemede suphelinin oldugu vagonu tahmin etmesi gerekecektir.

            }else if(tahminEdilenVagon>getSuphelininSaklandigiVagon()){
                //3.  Kullanıcıya 'ön vagonda' veya 'arka vagonda' ifadeleri ile yonlendirme yapılarak hangi vagonda oldugunu daha kolay bulmasına yardım edilecektir.
                System.out.println("On vagonda");
                start();
                count++;

            }

            if(count==3){
                System.out.println("Son Tahmin Hakkiniz!!!");

            }else if(tahminEdilenVagon==getSuphelininSaklandigiVagon()&&count==4){
                puan();
                break;

            }else if(count==4){
                System.out.println("Tahmin hakkiniz doldu");
                System.out.println("Henuz supheliyi yakalayamadiniz");
                System.out.println("Kaybettiniz...");
                puan();
                break;
            }
           // System.out.println("a : "+ count);
        }
    }
    //Kullanıcının kac defada bildiği ve puani (100 üzerinden) consola yazdırılacaktir.
    public void puan(){
        if(count>1) {
            if (tahminEdilenVagon != getSuphelininSaklandigiVagon()) {
                System.out.println("Uzgunuz... :(");
            }else{
                System.out.println(count + " Defada bildiniz " + " Puaniniz : " + (100 / count));
            } }else{
                System.out.println("Ilk Defada bildiniz" + " Puaniniz : " + (100));
            }
        }
    }

