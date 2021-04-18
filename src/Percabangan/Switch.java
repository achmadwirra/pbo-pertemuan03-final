package Percabangan;

public class Switch {
    public static void main(String[] args){
        char nilai='D';
        switch(nilai){
            case 'A':
                System.out.println("Mhs    : \"Terima kasih pak\"");
                System.out.println("Dosen  : \"Selamat ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs    : \"Kenapa ulun kada dapat A, Pak?\"");
                System.out.println("Dosen  : \"!@#$%\"");
                break;
            case 'C':
                System.out.println("Mhs    : \"Ulun turun tarus pak ai tugas gawi tarus :(\"");
                System.out.println("Dosen  : \"Tapi bisa lah menjawab ujian\"");
                System.out.println("Mhs    : \"kada pak ai :D\"");
                break;
            default:
                System.out.println("Mhs    : \"Ulun turun tarus pak ai tugas gawi jua\"");
                System.out.println("Dosen  : \"Bujur jua kah>\"");
                System.out.println("Dosen  : \"*Melihati Berkas\"");
                System.out.println("Dosen  : \"*Menceleng\"");
                System.out.println("Mhs    : \"Kaburrr...\"");
                break;
        }
    }
}
