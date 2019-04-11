import java.util.Scanner;

public class Temperatur {
    public static void main(String[] args) {

        int suhu;

        System.out.println("Masukkan Suhu :");


        Scanner temperatur = new Scanner(System.in);
        suhu = temperatur.nextInt();


        if (suhu < 25) {
            System.out.println("suhu " + suhu + " Celcius" + " dingin");
        } else if
        (suhu < 30) {
            System.out.println("Suhu " + suhu + " Celcius" + " Normal");



        }else if (suhu < 34){
            System.out.println("suhu " + suhu + " Celcius" + " Hangat");
        } else if (suhu  >= 34 && suhu < 100){
            System.out.println("suhu " + suhu + " Celcius " + " Panas");
        }
        else  {
            System.out.println("suhu " + suhu + " Celcius" + " Tidak Terdeteksi");

        }
    }
}
