package latihan;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka pertama : ");
        int angka1 = input.nextInt();

        System.out.println("Masukkan angka kedua : ");
        int angka2 = input.nextInt();

        System.out.println("Masukkan angka kedua : ");
        int angka3 = input.nextInt();

        int bigger;
        if (angka1 > angka2 && angka1 > angka3){
            bigger = angka1;
        } else if (angka2 > angka1 && angka2 > angka3){
            bigger = angka2;
        } else {
            bigger = angka3;
        }
        System.out.println("Angka terbesar adalah : " + bigger);
    }
}
