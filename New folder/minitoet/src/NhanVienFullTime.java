public class NhanVienFullTime extends NhanVien {
    private int salary;
    private int bonus;
    private int penaltyFee;

    public NhanVienFullTime() {
    }
    public NhanVienFullTime(int salary, int bonus, int penaltyFee) {
        this.salary = salary;
        this.bonus = bonus;
        this.penaltyFee = penaltyFee;
    }

    public NhanVienFullTime(String code, String name, String phoneNumber, String email, int age, int salary, int penaltyFee, int bonus) {
        super(code, name, phoneNumber, email, age);
        this.salary = salary;
        this.penaltyFee = penaltyFee;
        this.bonus = bonus;
    }

    @Override
    public int getIncome() {
        return this.salary+(this.bonus-this.penaltyFee);
    }
}
