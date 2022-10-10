public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double[] myList = {1.95, 2.52, 3.17, 8.31};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number)
                max = number;
            total = total + number;
            System.out.println(number);
        }
        System.out.println("TOPLAM= " + total);
        System.out.println("EN BÜYÜK= " + max);


    }
}