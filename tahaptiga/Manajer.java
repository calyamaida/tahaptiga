public class Manajer extends Karyawan {
    private int insentif;
    private String divisi;

    public void setInsentif(int insentif) {
        this.insentif = insentif;
    }

    public int getInsentif() {
        return insentif;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    public String getDivisi() {
        return divisi;
    }

    @Override
    public int hitungGaji() {
        return super.hitungGaji() + insentif;
    }

    @Override
    public String info() {
        return super.info() + "\nTunjangan: " + insentif + "\nDivisi: " + divisi;
    }
}