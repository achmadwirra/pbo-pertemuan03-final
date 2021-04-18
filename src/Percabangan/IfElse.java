package Percabangan;

public class IfElse {
    public static void main(String[] args){
        double totalBelanja = 60000;
        double uangDiDompet = 100000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, kurangi belanjaan anda");
        }else if(uangDiDompet>totalBelanja){
            double angsul = uangDiDompet-totalBelanja;
            System.out.println("Uang Cukup, angsul : "+angsul);
        }else{
            System.out.println("Uang pas... Kuyy..");
        }
    }
}
