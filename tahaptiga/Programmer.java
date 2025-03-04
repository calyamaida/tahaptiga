public class Programmer extends Karyawan {
    private int bonus;

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public int hitungGaji() {
        return super.hitungGaji() + bonus;
    }

    @Override
    public String info() {
        return super.info() + "\nBonus: " + bonus;
    }

}
