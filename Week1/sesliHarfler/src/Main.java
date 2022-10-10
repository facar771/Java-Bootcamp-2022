public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

       /* char harf = 'i';

        switch(harf){
            case 'A':
                System.out.println("Kalın Ünlü!");
                break;
            case 'a':
                System.out.println("Kalın Ünlü!");
                break;
            case 'I':
                System.out.println("Kalın Ünlü!");
                break;
            case 'ı':
                System.out.println("Kalın Ünlü!");
                break;
            case 'O':
                System.out.println("Kalın Ünlü!");
                break;
            case 'o':
                System.out.println("Kalın Ünlü!");
                break;
            case 'U':
                System.out.println("Kalın Ünlü!");
                break;
            case 'u':
                System.out.println("Kalın Ünlü!");
                break;
            case 'E':
                System.out.println("İnce Ünlü!");
                break;
            case 'e':
                System.out.println("İnce Ünlü!");
                break;
            case 'İ':
                System.out.println("İnce Ünlü!");
                break;
            case 'i':
                System.out.println("İnce Ünlü!");
                break;
            case 'Ü':
                System.out.println("İnce Ünlü!");
                break;
            case 'ü':
                System.out.println("İnce Ünlü!");
                break;
            case 'Ö':
                System.out.println("İnce Ünlü!");
                break;
            case 'ö':
                System.out.println("İnce Ünlü!");
                break;
            default:
                System.out.println("Geçersiz Karakter Girdiniz!");*/
        char harf = 'i';

        switch (harf) {
            case 'A':
            case 'U':
            case 'I':
            case 'O':
            case 'a':
            case 'u':
            case 'ı':
            case 'o':
                System.out.println("Kalın Ünlü!");
                break;
            case 'E':
            case 'e':
            case 'Ü':
            case 'ü':
            case 'İ':
            case 'i':
            case 'Ö':
            case 'ö':
                System.out.println("İnce Ünlü!");
                break;
            default:
                System.out.println("Geçersiz Karakter Girdiniz!");
                break;
        }


    }
}
