import java.util.Scanner;

public class m {
    public static void main(String[] args) {
        /*Manav Kasa Programı
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
        Örnek Çıktı;

        Armut Kaç Kilo ? :0
        Elma Kaç Kilo ? :1
        Domates Kaç Kilo ? :1
        Muz Kaç Kilo ? :2
        Patlıcan Kaç Kilo ? :3
        Toplam Tutar : 21.68 TL

         */
        double Armut= 2.14;//menu
        double Elma= 3.67;
        double Domates= 1.11;
        double Muz= 0.95;
        double Patlıcan= 5.00;

        Scanner dat = new Scanner(System.in);//user enter the quantity...
        System.out.println("Armut kaç kilo= ");
        int Arm=dat.nextInt();
        System.out.println("Elma kaç kilo= ");
        int Elm=dat.nextInt();
        System.out.println("Domates kaç kilo= ");
        int Dom=dat.nextInt();
        System.out.println("Muz kaç kilo= ");
        int Mu=dat.nextInt();
        System.out.println("Patlıcan kaç kilo= ");
        int Pat=dat.nextInt();

        System.out.println("Toplam tutar"+((Armut*Arm)+(Elma*Elm)+(Domates*Dom)+(Muz*Mu)+(Patlıcan*Pat))+" TL");


    }

}
