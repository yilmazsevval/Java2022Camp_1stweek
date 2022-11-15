public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

       /* System.out.println("Eleman sayısı: " + mesaj.length()); //length uzunluk
        System.out.println("5. eleman: " + mesaj.charAt(4)); // mesajın 5. elemanını verir
        System.out.println(mesaj.concat(" Yaşasın!")); //mesaja ekleme yapar
        System.out.println(mesaj.startsWith("B")); //mesaj B harfi ile başlıyorsa true döndürür. Büyük- küçük harf duyarlı
        System.out.println(mesaj.endsWith("a")); //mesaj a harfi ile bitmiyorsa false döndürür.
        char [] karakterler = new char[5]; //karakterler isimli char arrayi açaar.
        mesaj.getChars(0,5,karakterler, 0); //mesajın ilk 5 karakterini verir
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av")); //baştan başladığında ilk "av" kaçıncı sırada
        System.out.println(mesaj.lastIndexOf("a")); //sondan başladığında ilk a baştan kaçıncı sırada*/

     String yeniMesaj = mesaj.replace (' ', '-'); // mesajın içindeki boşluk yskarakterlini - ile değiştirir.
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5)); //mesajın 2. karakterinden 5. (dahil değil)karaketine kadar alır.

        for(String kelime : mesaj.split(" ")){ //mesajı bışluklara göre ayırarak satır satır verir
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); //tüm mesajı küçük harf yapar
        System.out.println(mesaj.toUpperCase()); //tüm mesajı büyük harfyapar
        System.out.println(mesaj.trim()); //mesajın başında sonunda boşluk varsa onları siler.





    }
}