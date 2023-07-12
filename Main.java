public class Main {
    public static void main(String[] args) {
        // create objects
        BukuLuar bukuLuar = new BukuLuar("BL001", "Judul Buku Luar");
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setKodePeminjam("123");
        mahasiswa.setNamaPeminjam("Nama Mahasiswa");
        Petugas petugas = new Petugas("Nama Petugas", "P001");
        Peminjaman peminjaman;

        try {
            // make peminjaman
            peminjaman = new Peminjaman(mahasiswa, petugas, bukuLuar);

            // calculate denda
            Denda denda = new Denda();
            int hariTerlambat = 7;
            int tagihan = denda.hitungDenda(hariTerlambat);
            System.out.println("Tagihan denda: " + tagihan);

            // add anti-denda
            denda.addAntiDenda();
            System.out.println("Sudah bayar denda, tagihan menjadi: " + denda.getTagihan());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
