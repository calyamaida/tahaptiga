public class Karyawan {
    private String nama;
    private int gajiPokok;
    private Perusahaan perusahaan;

    public void setNama(String nama) {
        if (nama == null || nama.length() < 4) {
            System.out.println("Nama tidak boleh kosong");
        } else {
            this.nama = nama;
        }
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int hitungGaji() {
        return gajiPokok;
    }

    public void setPerusahaan(Perusahaan perusahaan) {
        this.perusahaan = perusahaan;
    }

    public void getPerusahaan() {
        System.out.println("Nama Perusahaan: " + perusahaan.getNama());
    }

    public String info() {
        return "Nama: " + nama + "\nGaji Pokok: " + gajiPokok;
    }
}