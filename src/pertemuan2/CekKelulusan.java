package pertemuan2;

import java.util.Scanner;

public class CekKelulusan {

	public void dat3() {
		// membuat variabel dan Scanner
		int nilai;
		String nama;
		Scanner scan = new Scanner(System.in);

		// mengambil input
		System.out.println("Nama: ");
		nama = scan.nextLine();
		System.out.println("Nilai: ");
		nilai = scan.nextInt();

		// cek apakah dia lulus atau tidak
		if (nilai >= 70) {
			System.out.println("Selamat " + nama + ", anda lulus");
		} else {
			System.out.println("Maaf " + nama + ", anda belum lulus");
		}
	}
}
