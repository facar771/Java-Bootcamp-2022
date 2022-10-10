public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int number = 6;
        int total =0 ;
        for(int i = 1 ; i<number;i++){
            if(number % i ==0){
                total = total + i ;

            }

        }
        if(number==total){
            System.out.println("Mükemmel Sayıdır!");
        }
        else {
            System.out.println("Mükemmel Sayı Değildir!");
        }
    }
}