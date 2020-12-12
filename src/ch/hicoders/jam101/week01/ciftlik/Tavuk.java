package ch.hicoders.jam101.week01.ciftlik;

import ch.hicoders.jam101.week01.ciftci.Ciftci;
import java.util.Scanner;

public class Tavuk {

    private static String tavukIsmi;
    public static int TavukSayisi;

    public static String getTavukIsmi() {
        return tavukIsmi;
    }

    public static void setTavukIsmi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Tavuk ismi giriniz");
        tavukIsmi = scan.next();
        Tavuk.tavukIsmi = tavukIsmi;
        TavukSayisi = TavukSayisi+1;
        System.out.println("Tavuk Ismi: "+tavukIsmi);
        System.out.println("Toplam Tavuk Sayisi: "+TavukSayisi);
        System.out.println();
        Ciftci.Karsilama();
    }
}