public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int number1 = 1184;
        int number2 = 1210;
        int total1 = 0;
        int total2 = 0;

        for(int i =1;i<number1;i++){
            if(number1 % i ==0){
                total1= total1 + i;
            }
        }
        for(int j = 1 ;j<number2;j++){
            if(number2 % j ==0){
                total2=total2 + j;
            }
        }
        if(total1==number2 && total2==number1){
            System.out.println(number1+" ve "+number2+" Arkadaş Sayılardır!");
        }
        else{
            System.out.println(number1+" ve "+number2+" Arkadaş Sayılar Değildirler!");

        }
        // if de || kullanılırsa iki ihtimalden birinin gerçekleşmesi durumunda if in içine girer.
        /*if(total1==number2 ){
            if(total2==number1){
                System.out.println(number1+" ve "+number2+" Arkadaş Sayılardır!");
            }
        }
        else{
            System.out.println(number1+" ve "+number2+" Arkadaş Sayılar Değildirler!");
        }*/

    }
}