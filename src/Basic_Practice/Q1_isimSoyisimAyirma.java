package Basic_Practice;

import java.util.Scanner;

public class Q1_isimSoyisimAyirma {
    /*
     Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
     ad ayrı soyad ayrı sekilde ekrana yazdırınız.
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen isim ve soyisminizi giriniz");
        String isimsoyisim= scan.nextLine();

        String isim= isimsoyisim.substring(0,isimsoyisim.indexOf(" "));

        String soyisim = isimsoyisim.substring(isimsoyisim.indexOf(" ")+1);

        System.out.println("İsim :" + isim ) ;
        System.out.println("Soyisim :" + soyisim);



    }


}

