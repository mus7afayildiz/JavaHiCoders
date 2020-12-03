package jam101.week01.ciftci;

import jam101.week01.ciftlik.Inek;
import jam101.week01.ciftlik.Tavuk;
import java.util.Scanner;

public class Ciftci {

    public static void main(String[] args) {
        Karsilama();
    }

    public static void Karsilama(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Merhaba Hosgeldiniz");
        System.out.println("Inek eklemek icin 1 yaziniz");
        System.out.println("Tavuk eklemek icin 2 yaziniz");
        System.out.println("Ne Kadar Tavuk ve Ineginiz oldugunu gormek icin 3 yaziniz");
        System.out.println("Son eklenen Tavuk ve Ineginizin isimlerini gormek icin 4 yaziniz");
        System.out.println("Cikmak icin 0 yaziniz");
        System.out.println();

        int num = scan.nextInt();
        if(num ==1){
            Inek.setInekIsmi();
        }else if(num==2){
            Tavuk.setTavukIsmi();
        }else if(num==3){
            System.out.println("Tavuk sayisi: "+Tavuk.TavukSayisi);
            System.out.println("Inek sayisi: "+Inek.inekSayisi);
            System.out.println();
            Karsilama();
        }else if(num==4){
            System.out.println("Tavugunuzun ismi:"+Tavuk.getTavukIsmi());
            System.out.println("Ineginizin ismi:"+Inek.getInekIsmi());
            System.out.println();
            Karsilama();
        }else if(num==0){
            System.out.println("Hoscakalin");
            System.out.println();
        }else{
            System.out.println("Hatali giris yaptiniz");
            System.out.println();
            Karsilama();
        }
    }
}
