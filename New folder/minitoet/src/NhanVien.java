public class NhanVien {
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
    public int getIncome(){
        return 0;
    }

    public String getName() {
        return name;
    }
}
