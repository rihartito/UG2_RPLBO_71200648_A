import java.util.Scanner;

public class hitungGaji {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Berapa karyawan");
        int jmlLoop = inp.nextInt();

        System.out.println("Masukkan jumlah jam kerja");
        int totJamKerja = inp.nextInt();
        int totGaji = 0;

        if (totJamKerja == 8){
            totGaji = 300000;
        } else if (totJamKerja < 8) {
            int jam = 8 - totJamKerja;
            int potongan = 15000 * jam;
            totGaji -= potongan;

        } else if (totJamKerja > 8) {
            int jam = 8 - totJamKerja;
            int potongan = 15000 * jam;
            totGaji += potongan;
        }
    }
}
