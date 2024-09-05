package latihan;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.println("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        System.out.println("Pilih operator yang ingin dijalankan" +
                "1. Tambah" +
                "2. Kurang" +
                "3. Kali" +
                "4. Bagi");

        int pilih = input.nextInt();

        switch(pilih){
            int hsl;
            case 1:
                hsl = angka1 + angka2;
                System.out.println(hsl);
                break;
            case 2:
                hsl = angka1 - angka2;
                System.out.println(hsl);
                break;
            case 3:
                hsl = angka1 * angka2;
                System.out.println(hsl);
                break;
            case 4:
                hsl = angka1 / angka2;
                System.out.println(hsl);
                break;
            default:
                System.out.println("Pilih nomor antara 1-4");
                System.exit(0);
        }

    }
}
