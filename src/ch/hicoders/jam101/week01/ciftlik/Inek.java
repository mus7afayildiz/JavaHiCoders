package ch.hicoders.jam101.week01.ciftlik;

import ch.hicoders.jam101.week01.ciftci.Ciftci;
import java.util.Scanner;

public class Inek {

    private static String inekIsmi;
    public static int inekSayisi;

    public static String getInekIsmi() {
        return inekIsmi;
    }
    public static void setInekIsmi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen inek ismi giriniz");
        inekIsmi= scan.next();
        Inek.inekIsmi = inekIsmi;
        inekSayisi = inekSayisi+1;
        System.out.println("Inek ismi: "+inekIsmi);
        System.out.println("Toplam Inek sayisi: "+inekSayisi);
        System.out.println();
        Ciftci.Karsilama();
    }
}