package pertemuan2;

public class PerulanganBersarang {

	public void dat12() {
		// membuat variable
		int x, y;

		// melakukan perulangan sebanyak x dan y kali
		for (x = 0; x <= 5; x++) {
			for (y = 0; y <= 3; y++) {
				System.out.format("Perulangan [x=%d, y=%d] %n", x, y);
			}
		}
	}
}
