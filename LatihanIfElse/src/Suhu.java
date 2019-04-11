import java.util.Scanner;

public class Suhu {
    public static void main(String[] args) {
        int suhu = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Suhu :");
        suhu = scan.nextInt();

        switch (suhu){
            case 20 :
                System.out.println("dingin");
                break;
            case 30 :
                System.out.println("Normal");
                break;
            case 35 :
                System.out.println("Panas");

                default:
                    System.out.println("suhu Tidak Tersedia");
        }
    }
}
