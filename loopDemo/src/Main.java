public class Main {
    public static void main(String[] args) {
        //For
        for(int i=1; i<10; i+=2){
            System.out.println(i);
        }
        System.out.println("For Döngüsü bitti");

        //while
        int i =1;
        while(i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Döngüsü bitti");

        //Do while: while dan farklı olarak şart sağlanmasa bile bir kez çalışır
        int j = 1;
        do{
            System.out.println(j);
            j+=2;

        } while(j<10);
        System.out.println("Do - While Döngüsü Bitti");

    }
}