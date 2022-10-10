public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //for döngüsünde ilk kısıma sayaç ikinci kısıma şart üçüncü kısıma ise sayacın kaçar kaçar artacağını belirtiriz
//for döngüsü

        for(int i=1 ;i<=12;i++) {
            System.out.println(i) ;

        }
        System.out.println("Döngü Bitti!") ;
        for(int i=1 ;i<=12;i+=2) {
            System.out.println(i) ;

        }
        System.out.println("Döngü Bitti!") ;
        for(int i=2 ;i<=12;i+=2) {
            System.out.println(i) ;

        }
        System.out.println("Döngü Bitti!") ;
        System.out.println("For Döngüsü Bitti!") ;

// while döngüsü
        int i = 1 ;

        while(i<=15) {
            System.out.println(i) ;
            i+=2 ;
        }
        System.out.println("While Döngüsü Bitti!");

//do-while döngüsü
        int j = 1;

        do{
            System.out.println(j);
            j+=1;
        }while(j<10);
        System.out.println("Do-While Döngüsü Bitti!");
//do while şart sağlanmasa bile çalışır örneğin j = 100 yazarsak ekranda 100 yazar













    }
}