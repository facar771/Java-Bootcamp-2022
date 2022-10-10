public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] sayilar = new int [] {1,3,5,7,9,0};
        int aranacak = 8;
        boolean varMi = false;
        for(int sayi:sayilar){
            if(aranacak==sayi){
                varMi = true;
                break;
            }
         }
        if(varMi){
            System.out.println("Sayı Vardır!");
        }
        else{
            System.out.println("Sayı Yoktur!");
        }
        }
    }
