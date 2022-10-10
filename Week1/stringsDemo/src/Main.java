public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String mesaj = "Bugün Hava Çok Güzel !";
        System.out.println(mesaj);
        /*System.out.println("Eleman Sayısı = "+ mesaj.length());
        System.out.println("5. Eleman = "+ mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("!"));

        char[] karakterler = new char [8];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("a"));
        System.out.println(mesaj.lastIndexOf("Ç"));
*/
        String yeniMesaj = mesaj.replace(" ","_");
        System.out.println(mesaj.replace(" ","_"));
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2,5));

        for(String kelimeler : mesaj.split(" ")){
            System.out.println(kelimeler);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
        //.trim metnin başındaki ve sonundaki boşlukları siler.



    }
}