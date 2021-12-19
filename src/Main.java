import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double distance, age,  price=0.10, ticketPrice;
        int tip;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen mesafe giriniz : ");
        distance = input.nextDouble();

        System.out.print("Lütfen yaşınızı giriniz:");
        age = input.nextDouble();

        System.out.print("Lütfen yolculuk tipini seçiniz:\n1-Gidiş\n2-Gidiş-Dönüş ");
        tip = input.nextInt();

        ticketPrice=distance*price;
        System.out.println("Bilet ücreti="+ticketPrice+" TL" );

        if (age<=12){
            System.out.println("İndirimli bilet ücreti="+(ticketPrice/2)+" TL" );
        }else if(age>12 && age<=24){
            System.out.println("İndirimli bilet ücreti="+(ticketPrice-(ticketPrice/10))+" TL");

        }else if(age>=65){
            System.out.println("İndirimli bilet ücreti="+(ticketPrice-(ticketPrice*0.3))+" TL");
        }
        if ( tip==2 ){
            System.out.println("İndirimli Bilet Fiyatı= "+(ticketPrice-(ticketPrice*0.2)));
        }else{
            System.out.println("Girdiğiniz değer yanlış...");
        }
    }
}

