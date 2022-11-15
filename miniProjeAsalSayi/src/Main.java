public class Main {
    public static void main(String[] args) {
        int number = 25;
        int remainder = number % 2;  //number mod 2 demek. 2'ye bölümünden kalanı verir.
        System.out.println(remainder);
        boolean asalSayiMi = true;

        if(number==1){
            System.out.println("Sayı asal değildir.");
            return;
        }

        if(number<1){
            System.out.println("Geçersiz sayı");
        }

        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                asalSayiMi = false;
            }
        }
        if (asalSayiMi == true) {
            System.out.println("Sayı asaldır.");
        } else {
            System.out.println("Sayı asal değildir.");
        }


    }
}