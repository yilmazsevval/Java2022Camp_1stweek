public class Main {
    public static void main(String[] args) {
        char grade = 'E';

        switch (grade) { //switch bloğunun içinde şartımızın öznesi
            case 'A': //durum demek
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok güzel : Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");

        }

    }
}