package latihan;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka pertama : ");
        int angka1 = input.nextInt();

        System.out.println("Masukkan angka kedua : ");
        int angka2 = input.nextInt();

        int bigger;
        if (angka1 > angka2){
            bigger = angka1;
        } else {
            bigger = angka2;
        }

        System.out.println("Angka terbesar adalah : " + bigger);
    }
}
