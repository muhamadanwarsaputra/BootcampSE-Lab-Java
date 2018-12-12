package pertemuan2;

import java.util.Scanner;

public class PerulanganWhile {
	public void dat10() {
		// membuat variable dan scanner
		boolean running = true;
		int counter = 0;
		String jawab;
		Scanner scan = new Scanner(System.in);

		while (running) {
			System.out.println("Apakah anda ingin keluar ?");
			System.out.println("Jawaban [ya/tidak]> ");

			jawab = scan.nextLine();

			// cek jawabannya, kalau ya maka berhenti mengulang
			if (jawab.equals("ya")) {
				running = false;
			}

			counter++;
		}
		System.out.println("Anda sudah melakukan perulangan sebanyak" + counter + "kali");
	}
}
