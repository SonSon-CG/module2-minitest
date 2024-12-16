public abstract class NhanVien {
    private String code;
    private String name;
    private int age;
    private String phoneNumber;
    private String email;

    public NhanVien() {
    }

    public NhanVien(String code, String name, String phoneNumber, String email, int age) {
        this.code = code;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
    }
    public  abstract int getIncome();

    public String getName() {
        return name;
    }
}
