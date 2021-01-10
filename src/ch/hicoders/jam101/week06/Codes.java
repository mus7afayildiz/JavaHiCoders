package ch.hicoders.jam101.week06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Codes {
     String partOfBike,wantedWord,trimmedWord;
     String adding1 = "ASLIAG_";
     LocalDate adding2 = LocalDate.now();
     List<String > parts = new ArrayList<>();

    public void enter(){//Sistemin baslangicinin yapildigi method
        for(int i=0; i<=10;i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Bir Parca giriniz");
            partOfBike = scan.next().toUpperCase(Locale.ROOT);
            cutNumbers();
            reverse();
            adding();
            parts.add(wantedWord);
            System.out.println(parts.toString());
            System.out.println();
        }
        System.out.println("Tesekkurler");
    }


    public void cutNumbers(){//Sayilarin ve diger kullanilmayan characterlerin uzaklastirildigi method
        List<String> onlyChar = new ArrayList<>();
        for(int i=0; i<partOfBike.length();i++){
            String character = partOfBike.substring(i,i+1);
            int charDeger = character.charAt(0);
            if(charDeger>57) {
                onlyChar.add(character);
            }
        }
        trimmedWord = onlyChar.toString().replace(",","").replace(" ","").replace("[","").replace("]","");
    }


    public void reverse(){//Stringi tersine cevirme methodu
        StringBuilder reversePartOfBike = new StringBuilder(trimmedWord);
        reversePartOfBike.reverse();
        trimmedWord = reversePartOfBike.toString();
    }


    public void adding(){//Stringi istenilen hale getirmek icin gereken eklentilerin yapildigi method
        wantedWord = adding1+trimmedWord+adding2.toString().replace("-","");
    }
}
