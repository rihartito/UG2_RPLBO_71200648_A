import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Pilihan :");
        System.out.println("1.Penyetoran");
        System.out.println("2.Penarikan");
        System.out.println("3.Lihat Saldo");
        System.out.println("masukkan pilihan :");
        int pilihan = inp.nextInt();

        TabunganKonvesional konvesional = new TabunganKonvesional("K_71200648",0.0);
        TabunganBerjangka berjangka = new TabunganBerjangka("I_71200648",0.0);

        if (pilihan ==1){
            System.out.println("--Tabungan Konvensional---");
            konvesional.penyetoran(200000);
            System.out.println("---Tabungan Berjangka---");
            berjangka.penyetoran(1000000.0);
        } else if (pilihan == 2) {
            System.out.println("---Tabungan Konvesional---");
            konvesional.penarikan(50000);
            System.out.println("---Tabungan Berjangka---");
            berjangka.penarikan(50000.0);

        } else if (pilihan ==3) {
            konvesional.getSaldo();
            berjangka.getSaldo();


        }else System.out.println("Masukkan plihan yg benar");


    }
}
