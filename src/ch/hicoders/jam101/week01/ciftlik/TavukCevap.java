package ch.hicoders.jam101.week01.ciftlik;

public class TavukCevap {
    private String name;
    public static int count = 0;
    public TavukCevap(String pName){ // constructor
        this.name = pName;
        count++; // count = count + 1;
        if(pName == null){
            this.name = "TavukCevap" + count;
        }
    }
    public String getName(){
        return this.name;
    }
}

