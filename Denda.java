public class Denda {
    private static final int TARIF_DENDA = 10000;
    private int tagihan;

    public int hitungDenda(int hariTerlambat) {
        tagihan = TARIF_DENDA * hariTerlambat;
        return tagihan;
    }

    public void addAntiDenda() {
        tagihan = 0;
    }

    public int getTagihan() {
        return tagihan;
    }
}
