import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        double tutar,KDV_Oran =0.18;
        Scanner input =new Scanner(System.in);
        System.out.println("tutar giriniz: ");
        tutar = input.nextDouble();
        double kdvtutar = tutar*KDV_Oran;
        double sonuc = kdvtutar + tutar;
        System.out.println("kdv li urunun son tutarı =" + sonuc);

    }
}