public class Main {
    public static void main(String[] args) {
        Perusahaan perusahaan = new Perusahaan();

        Karyawan karyawan1 = new Karyawan();
        karyawan1.setNama("Budi Santoso");
        karyawan1.setGajiPokok(5000000);
        karyawan1.setPerusahaan(perusahaan);

        Karyawan karyawan2 = new Karyawan();
        karyawan2.setNama("Ani Wijaya");
        karyawan2.setGajiPokok(6000000);
        karyawan2.setPerusahaan(perusahaan);

        Programmer programmer = new Programmer();
        programmer.setNama("Joko Susilo");
        programmer.setGajiPokok(7000000);
        programmer.setBonus(500000);
        programmer.setPerusahaan(perusahaan);

        Manajer manajer = new Manajer();
        manajer.setNama("Calya Maida");
        manajer.setGajiPokok(15000000);
        manajer.setDivisi("Web Development");
        manajer.setInsentif(1000000);
        manajer.setPerusahaan(perusahaan);

        System.out.println("1. Informasi Karyawan:");
        System.out.println(karyawan1.info());
        karyawan1.getPerusahaan();
        System.out.println();

        System.out.println("2. Informasi Karyawan:");
        System.out.println(karyawan2.info());
        karyawan2.getPerusahaan();
        System.out.println();

        System.out.println("3. Informasi Karyawan:");
        System.out.println(programmer.info());
        programmer.getPerusahaan();
        System.out.println();

        System.out.println("4. Informasi Karyawan:");
        System.out.println(manajer.info());
        manajer.getPerusahaan();
        System.out.println();
    }
}