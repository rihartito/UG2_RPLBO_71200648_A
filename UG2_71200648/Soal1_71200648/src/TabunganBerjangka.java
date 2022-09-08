public class TabunganBerjangka {
    private String pemilik = "I_71200648";
    private Double saldo;

    public TabunganBerjangka(String nasabah,double isi){
        pemilik = nasabah;
        nasabah = "I_71200648";
        saldo = isi;
        isi = 0.0;
    }

    public void getSaldo(){
        System.out.println("saldo :"+ pemilik + "=" + saldo);
    }
    public void penarikan(double tarik){
        System.out.println("Penarikan Rp.50.000");
        saldo -= tarik;
    }
    public void penyetoran(double setor){
        System.out.println("penyetoran");
        saldo += setor;
    }
}
