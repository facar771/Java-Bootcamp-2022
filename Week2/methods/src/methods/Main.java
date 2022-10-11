package methods;

public class Main {

	public static void main(String[] args) {
		findthenumber();
		findthenumber();
		findthenumber();
		findthenumber();

	}

	public static void findthenumber() {

		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int wanted = 7;
		boolean varMi = false;

		for (int number : numbers) {
			if (number == wanted) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			giveMessage("Sayı mevcuttur: " + wanted);
		} else {
			giveMessage("Sayı mevcut değildir." + wanted);
		}
	}

	public static void giveMessage(String message) {
		System.out.println(message);

	}

}
