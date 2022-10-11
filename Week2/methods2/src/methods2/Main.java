package methods2;

public class Main {

	public static void main(String[] args) {
		String messageString = "Bugün hava çok güzel.";
		String newMessage = giveCity();
		System.out.println(newMessage);
		int sayi = add(15, 7);
		System.out.println(sayi);
		int total = add2(2, 3, 4, 8, 7);
		System.out.println(total);
	}

	public static void add() {
		System.out.println("Eklendi");
	}

	public static void remove() {
		System.out.println("Silindi");
	}

	public static void update() {
		System.out.println("Güncellendi");
	}

	public static int add(int number1, int number2) {
		return number1 + number2;
	}

	public static int add2(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}

		return total;
	}

	public static String giveCity() {
		return "Ankara";
	}
}
