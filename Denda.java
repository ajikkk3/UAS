public class Denda {
    private int tarifDenda;
    private boolean antiDenda;

    public Denda() {
        tarifDenda = 10000;
        antiDenda = false;
    }

    public void setTarifDenda(int tarif) {
        tarifDenda = tarif;
    }

    public int getTarifDenda() {
        return tarifDenda;
    }

    public void addAntiDenda() {
        antiDenda = true;
    }

    public void removeAntiDenda() {
        antiDenda = false;
    }

    public boolean getAntiDenda() {
        return antiDenda;
    }
}
