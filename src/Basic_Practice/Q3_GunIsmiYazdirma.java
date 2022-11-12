package Basic_Practice;

import java.util.Scanner;

public class Q3_GunIsmiYazdirma {
    //Kullanıcıdan gün numarasını alıp
    // gün ismini yazdıran bir program yazın

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen gün numarasını giriniz");
        int gunsayisi= scan.nextInt();

        System.out.println("================IF ELSE Çözümü================");

        if (gunsayisi<=0 || gunsayisi>7)
            System.out.println("Geçersiz giriş yaptınız");
        else if (gunsayisi==1) System.out.println("Pazartesi");
        else if (gunsayisi==2) System.out.println("Salı");
        else if (gunsayisi==3) System.out.println("Çarşamba");
        else if (gunsayisi==4) System.out.println("Perşembe");
        else if (gunsayisi==5) System.out.println("Cuma");
        else if (gunsayisi==6) System.out.println("Cumartesi");
        else System.out.println("Pazar");

        System.out.println("==============SWITCH CASE Çözümü==============");

        switch (gunsayisi) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
        }

                /*/*
          Kullanicidan gun ismini alin
          ve girilen gun ismine gore
          hafta ici veya hafta sonu yazdirin
         */


        System.out.println("Lütfen gün ismi giriniz");

        String gunismi= scan.next();

        //Kullanıcı PAZARTESİ, pazarTESİ, Pazartesi vs. frğişik şekilde girebilir

        gunismi= gunismi.toLowerCase();

        switch (gunismi){

            case "pazartesi" :
            case "salı"      :
            case "çarşamba"  :
            case "perşembe"  :
            case "cuma"      : System.out.println("Girdiğiniz gün haftaiçidir"); break;
            case "cumartesi" :
            case "pazar"     : System.out.println("Girdiğiniz gün haftasonudur");break;
            default          : System.out.println("Yanlış giriş yaptınız");


        }

    }

}
