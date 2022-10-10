public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String ogrenci1="Ali";
        String ogrenci2="Veli";
        String ogrenci3="Ahmet";
        String ogrenci4="Gamze";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-------------------------");


        String[] ogrenciler = new String[4] ;
        ogrenciler[0]="Ali";
        ogrenciler[1]="Veli";
        ogrenciler[2]="Ahmet";
        ogrenciler[3]="Gamze";

        for(int i=0; i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
//aynı işlevi gören bir diğer for döngüsü

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}