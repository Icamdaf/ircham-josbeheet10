import java.util.Scanner;

public class BioskopWithScanner20 {

    public static void main(String[] args) {
        Scanner scan20 = new Scanner(System.in);
        int baris, kolom;
        String nama;
        String next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = scan20.nextInt();
            scan20.nextLine(); 
            switch (menu) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    nama = scan20.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = scan20.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = scan20.nextInt();
                    scan20.nextLine(); 
                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil disimpan.");
                        } else {
                            System.out.println("Kursi tersebut sudah terisi.");
                        }
                    } else {
                        System.out.println("Posisi baris atau kolom tidak valid.");
                    }
                    break;
                case 2:
                    System.out.println("Daftar penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] != null) {
                                System.out.printf("Baris %d, Kolom %d: %s\n", i + 1, j + 1, penonton[i][j]);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih! Keluar dari program.");
                    System.exit(0); //
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu 1, 2, atau 3.");
            }

            System.out.print("Lanjutkan? (y/n): ");
            next = scan20.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
