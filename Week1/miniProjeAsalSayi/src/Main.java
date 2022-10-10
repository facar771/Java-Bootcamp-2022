public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int number = -5 ;
        //int reminder = number % 2 ;
        // reminder : kalan % kalan operatörüdür.
        //System.out.println(reminder);

        boolean isPrime = true;

        for(int i =2 ; i<number; i++){
            if(number % i ==0){
                isPrime = false ;
            }

        }

        if(number==1){
            System.out.println("Sayı Asal Değildir!");
            return;
        }
        if(number<1){
            System.out.println("Geçersiz Sayı Girdiniz");
        }
        /*if(isPrime==true){
            System.out.println("Sayı Asaldır!");
        }
        if(isPrime==false){
            System.out.println("Sayı Asal Değildir");
        }*/
        if(isPrime){
            System.out.println("Sayı Asaldır!");
        }
        else{
            System.out.println("Sayı Asal Değildir!");
        }


        }

    }
