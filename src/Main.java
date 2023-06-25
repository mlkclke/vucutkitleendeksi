import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo;
        double vucutkitleindeksi ;

        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (santimetre cinsinde) giriniz :");
        boy = inp.nextInt();
        System.out.println("Lütfen kilonuzu girin :");
        kilo = inp.nextInt();

        vucutkitleindeksi = Math.sqrt(kilo / boy * boy);
        System.out.println("vucutkitleindeksi : " + vucutkitleindeksi);



    }
}