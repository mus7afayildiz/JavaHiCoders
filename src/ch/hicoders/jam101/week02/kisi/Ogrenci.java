package ch.hicoders.jam101.week02.kisi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ogrenci {
    static String OgrenciAdi;
    static int MatematikNotu, AlmancaNotu;



    static List<List<Object>> ogrenciListesi = new ArrayList<List<Object>>();
    static List<Object> ogrenciler = new ArrayList<Object>();



    public Ogrenci(String pOgrenciAdi, int pMatematikNotu, int pAlmancaNotu) {
        OgrenciAdi = pOgrenciAdi;
        MatematikNotu = pMatematikNotu;
        AlmancaNotu = pAlmancaNotu;


    }

    public static void ogr(String pOgrenciAdi, int pMatematikNotu, int pAlmancaNotu) {

            ogrenciler.add(pOgrenciAdi);
            ogrenciler.add(pMatematikNotu);
            ogrenciler.add(pAlmancaNotu);
            ogrenciListesi.add(ogrenciler);

    }



}





