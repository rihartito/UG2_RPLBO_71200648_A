public class TabunganKonvesional {
    private String pemilik;
    private Double saldo ;

    public TabunganKonvesional(String nasabah,double isi){
        pemilik = nasabah;
        nasabah = "K_71200648";
        saldo=isi;
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
        System.out.println("Penyetoran RP.200.000");
        saldo += setor;
        }
    }


