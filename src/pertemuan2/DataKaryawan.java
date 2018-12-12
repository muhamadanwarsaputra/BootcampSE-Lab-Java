package pertemuan2;

// mengimpor Scanner ke program
import java.util.Scanner;

public class DataKaryawan {

	public void dat() {
		// TODO Auto-generated method stub

		// deklarasi variabel
		String nama, alamat;
		int usia, gaji;

		// membuat scanner baru
		Scanner keyboard = new Scanner(System.in);

		// Tampilkan output ke user
		System.out.println("### Pendataan Karyawan PT. Petani Kode ##");
		System.out.println(" Nama karyawan : ");

		// menggunakan scanner dan menyimpan apa yang diketik di variabel nama
		nama = keyboard.nextLine();
		System.out.println("Alamat: ");

		// menggunakan scanner lagi
		alamat = keyboard.nextLine();

		System.out.println("Usia: ");
		usia = keyboard.nextInt();

		System.out.println();

		System.out.println("Gaji: ");
		gaji = keyboard.nextInt();

		// Menampilkan apa yang sudah simpan divariable
		System.out.println("----------");
		System.out.println("Nama karyawan : + nama");
		System.out.println("Alamat : + alamat");
		System.out.println("Usia :" + usia + " Tahun");
		System.out.println("Gaji : + gaji");
	}

}
