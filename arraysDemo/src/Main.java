public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("------------");


        //array kullanımı ile []

        String [] ogrenciler = new String[4]; //kaç öğrenciden oluşuyorsa new string köşeli parantezine yazılır
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Ahmet";

        for(int i=0; i< ogrenciler.length; i++ ){//i 0 dan başlayarak ogrencilerin uzunluğu kadar 1 1 arttır.
            System.out.println(ogrenciler[i]);
        }
        System.out.println("------------");
        for (String ogrenci: ogrenciler){
            System.out.println(ogrenci);
        }

    }
}