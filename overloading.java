import java.util.Scanner;

public class overloading{
   public data_warga inputdata_warga(){
        data_warga data_warga=new data_warga();
        Scanner sc=new Scanner(System.in);
        System.out.println("*** Data Warga ***");
        System.out.println("Masukan Nama : ");
        data_warga.setNama(sc.nextLine());
        System.out.println("Masukan NIK : ");
        data_warga.setNik(sc.nextLine());
        System.out.println("Masukan Alamat : ");
        data_warga.setAlamat(sc.nextLine());
        System.out.println("Masukan No. Tlp : ");
        data_warga.setNoTelp(sc.nextLine());
        System.out.println("---------------------o0o-------------------------");
        System.out.println("*** Data Pekerjaan ***");
        System.out.println("Masukan Pekerjaan : ");
        data_warga.setJenis_pekerjaan(sc.nextLine());
        System.out.println("Masukan Alamat Kantor : ");
        data_warga.setAlamat_kantor(sc.nextLine());
        System.out.println("---------------------o0o-------------------------");
        System.out.println("*** Data Status ***");
        System.out.println("Masukan Status : ");
        data_warga.setStatus(sc.nextLine());
        System.out.println("Masukan Nama Suami/Istri : ");
        data_warga.setNamaPasangan(sc.nextLine());
        System.out.println("Masukan Jumlah Anak : ");
        data_warga.setJml_anak(sc.nextInt());

        return data_warga;
    }
}
