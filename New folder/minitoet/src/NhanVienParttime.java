public class NhanVienParttime extends NhanVien {
    private int workingHours;
    public NhanVienParttime() {
    }
    public NhanVienParttime(int workingHours) {
        this.workingHours = workingHours;
    }

    public NhanVienParttime(String code, String name, String phoneNumber, String email, int age, int workingHours) {
        super(code, name, phoneNumber, email, age);
        this.workingHours = workingHours;
    }

    @Override
    public int getIncome() {
        return this.workingHours*100000;
    }
}
