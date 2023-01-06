import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_class extends iuran_warga {
    public static void main(String[] args) {
        int pilih=0;
        String lanjut;
        data_warga data_warga=new data_warga();

        overloading overloading=new overloading();
        overriding overriding=new overriding();
        List<Integer> result=new ArrayList<Integer>();
        do{
            Scanner sc=new Scanner(System.in);

            if(data_warga.getNama()!=null){
                System.out.println("Lanjut Bayar Iuran ?");
                lanjut=sc.nextLine();
                if(lanjut.equalsIgnoreCase("ya")){
                    pilih=2;
                }else{
                    pilih=0;
                }
            }else{
                System.out.println("=====================================");
                System.out.println("Pendataan dan Pembayaran Iuran Warga");
                System.out.println("=====================================");
                System.out.println("1. Input Data Warga");
                System.out.println("2. Input Iuran Warga");
                System.out.print("Pilihan Menu : ");
                pilih = sc.nextInt();
            }
            System.out.println("-----------------o0o-----------------");
            if(pilih==1){
                data_warga = overloading.inputdata_warga();
            }else if(pilih==2){
                overriding.inputData_iuran(data_warga.getNik());
                result =  overriding.getResult();
            }
        }while (pilih!=0);

        System.out.printf("|| %-28s || %-10s ",
                "NIK",result.get(0));
        System.out.println();
        System.out.printf("|| %-10s || %-5s ",
                "Total Pembayaran Iuran Warga",result.get(1));
        System.out.println();
        System.out.println("Terimakasih "+data_warga.getNama()+" Iuran Anda Sudah di Bayarkan");

    }
}
