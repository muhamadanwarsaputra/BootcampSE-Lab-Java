package pertemuan2;

import java.util.Scanner;

public class Buah {
	public void dat8() {
		// membuat array buah-buahan
		String[] buah = new String[5];

		// membuat scanner
		Scanner scan = new Scanner(System.in);

		// mengisi data ke array
		for (int i = 0; i < buah.length; i++) {
			System.out.println("Buah ke-" + i + ": ");
			buah[i] = scan.nextLine();
		}

		System.out.println("------------------------------------");

		// menampilkan semua isi array
		for (String b : buah) {
			System.out.println(b);
		}

	}
}
