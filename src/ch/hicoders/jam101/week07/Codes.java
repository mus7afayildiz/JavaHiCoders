package ch.hicoders.jam101.week07;

import java.util.Scanner;

public class Codes {
    Scanner scan = new Scanner(System.in);
    String PMAM;
    int hour,timePM;

    public void convert() {
        for (int i=0; i<10; i++){

        System.out.println("Lutfen cevirmek istediginiz zamani SS:DD AM veya SS:DD PM olarak giriniz");
        String time = scan.nextLine();
        String[] timeArr = time.split(" ");
        PMAM = timeArr[1];

        switch (PMAM) {
            case "AM":
                System.out.println("satiniz 24 saatlik formatta : " + timeArr[0]);
                break;
            case "PM":
                String[] timeHour = timeArr[0].split(":");
                hour = Integer.parseInt(timeHour[0]);
                timePM = hour + 12;
                System.out.println("satiniz 24 saatlik formatta : " + timePM + ":" + timeHour[1]);
                break;
            default:
                System.out.println("Hatali giris yaptiniz");
            }
        }
    }
}
