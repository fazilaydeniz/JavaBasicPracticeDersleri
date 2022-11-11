package Basic_Practice;

import java.util.Scanner;

public class Q2_KrediKartNumarasiYildizlama {
    public static void main(String[] args) {
        //Kullanıcıdan ismini soyismini ve kredi kartı numarasını alın ilk harfleri hariç diğer harflerin yerine * koyun.
        // Kredi kartı numarasını kontrol edin, 16 haneli değilse yanlış kart numarası yazdırın.
        // 16 nolu kredi kartı numarasının da son 4 hanesi hariç önceki numaraların yerine * koyun.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String ad= scan.nextLine();
        System.out.println("Lütfen soyadınızı giriniz");
        String soyadı= scan.nextLine();
        System.out.println("Lütfen 16 nolu kredi kartı numaranızı giriniz.");
        String ccn= scan.nextLine();

        if (ccn.length()!=16) System.out.println("Invalid credit cart number");
        else {
            ad= ad.substring(0,1).toUpperCase()+ad.substring(1).replaceAll("\\w","*");
            soyadı=soyadı.substring(0,1).toUpperCase()+ soyadı.substring(1).replaceAll("\\w","*");
            ccn= "**** **** **** " + ccn.substring(12) ;
            System.out.println("Adı Soyadı : " + ad + " " + soyadı + "\nccn : " + ccn);

        }
    }
}