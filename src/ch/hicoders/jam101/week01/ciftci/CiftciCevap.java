package ch.hicoders.jam101.week01.ciftci;


import ch.hicoders.jam101.week01.ciftlik.TavukCevap;

public class CiftciCevap {
        public static void main(String[] args) {
            TavukCevap birinci_tavuk = new TavukCevap("cilli");
            TavukCevap ikinci_tavuk = new TavukCevap(null);
            System.out.println("Tavuk.count : " + TavukCevap.count);
            System.out.println("Birinci Tavuk : " + birinci_tavuk.getName());
            System.out.println("Ikinci Tavuk : " + ikinci_tavuk.getName());

    }
}
