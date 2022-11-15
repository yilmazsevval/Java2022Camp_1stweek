public class Main {
    public static void main(String[] args) {
        int [] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 8;
        boolean varMi = false;


        for(int sayi : sayilar){
            if(aranacak == sayi){
                varMi = true;
                break;
            }
        }
        if(varMi){
            System.out.println(aranacak + " sayısı mevcuttur.");
        }else{
            System.out.println(aranacak + " sayısı mevcut değildir.");
        }
    }
}