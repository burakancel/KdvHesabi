import java.util.Scanner;

public class kdvOdev {
    public static void main(String[] args) {

        double tutar,kdvMiktar,kdvTutari; boolean kdv;
        Scanner input=new Scanner(System.in);
        System.out.print("Tutar giriniz :");
        tutar = input.nextDouble();
        kdv = tutar > 1000;
        kdvMiktar = kdv ? 0.08 : 0.18 ;

        kdvTutari = tutar * kdvMiktar;
        System.out.println("Kdv'li Fiyat: " + (tutar+ kdvTutari));
        System.out.println("Kdv'siz Fiyat: " + tutar );
        System.out.println("Kdv Oranı"+kdvMiktar);
        System.out.println("Kdv' Tutarı: " + kdvTutari);




    }
}
