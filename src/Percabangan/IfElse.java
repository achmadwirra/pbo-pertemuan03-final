package Percabangan;

public class IfElse {
    public static void main(String[] args){
        double totalBelanja = 60000;
        double uangDiDompet = 30000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, kurangi belanjaan anda");
        }else{
            System.out.println("Uang Cukup, Selamat Menikmati Belanjaan Anda");
        }
    }
}
