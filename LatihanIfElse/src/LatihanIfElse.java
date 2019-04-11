import java.util.Scanner;

public class LatihanIfElse {



    public static void main(String[] args) {

        int Bencana = 1;
        String Lancar ="siap";
        int NilaiKelulusanSD;
        String nama;
        int harga;
        Scanner scan = new Scanner(System.in);




       //Memakai ==
        if (Bencana == 0) {
            System.out.println("Banjir Woy ");
        }else {
            System.out.println("Indonesia Telah Membuat Tol Dengan Harga Murah Dan Lancar");

        }
        System.out.println();
        System.out.println();


        //Memakai !=
        if (Lancar !="belum"){
            System.out.println("PAK Jalanan Lancar Jaya Lapor Berangkat");
        }else{
            System.out.println("Pak Jalanan Macet Karna Banjir Lapor Di tunda");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();



        //Memakai >
        System.out.println("Nama : ");
        nama = scan.nextLine();
        System.out.print("Jumlah Nilai Ujian Nasional SD Kalian :");
        NilaiKelulusanSD = scan.nextInt();

        if (NilaiKelulusanSD > 240){
            System.out.println("Selamat  " + nama + " Anda Lulus SD Selamat Melanjutkan ke jenjang SMP");
        }else {
            System.out.println("Maaf " + nama + " Anda Harus Tetap Di SD");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();



        // Memakai <
        System.out.println("harga :");
        harga = scan.nextInt();

        if (harga < 2000000){
            System.out.println("Maaf Anda Belum Beruntung ");

        }else {
            System.out.println("Anda Berhak Membawa Pulang Redmi Note 7");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();



        //Memakai <=
        System.out.println("harga :");
        harga = scan.nextInt();

        if (harga <= 200000){

            System.out.println("tidak dapat diskon");
        }else{
            System.out.println("Dapat Diskon");
        }




        }
    }

