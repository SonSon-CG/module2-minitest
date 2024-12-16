//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NhanVienFullTime f1 = new NhanVienFullTime("001", "son1", "111", "1@gmail.com", 11, 11000000, 100000, 1000000);
        NhanVienFullTime f2 = new NhanVienFullTime("002", "son2", "222", "2@gmail.com", 22, 22000000, 200000, 2000000);
        NhanVienFullTime f3 = new NhanVienFullTime("003", "son3", "333", "3@gmail.com", 33, 33000000, 300000, 3000000);
        NhanVienParttime p4 = new NhanVienParttime("004", "son4", "444", "4@gmail.com", 44, 40);
        NhanVienParttime p5 = new NhanVienParttime("005", "son5", "555", "5@gmail.com", 55, 50);
        NhanVienParttime p6 = new NhanVienParttime("006", "son6", "666", "6@gmail.com", 66, 60);

        NhanVien[] nhanVienArray = {f1, f2, f3, p4, p5, p6};
        for (NhanVien nhanVien : nhanVienArray) {
            System.out.println("Luong cua nhan vien " + nhanVien.getName() + "la:  " + nhanVien.getIncome());
        }

        int sum = 0;
        for (NhanVien nhanVien : nhanVienArray) {
            sum += nhanVien.getIncome();
        }
        int averageIncome = sum / nhanVienArray.length;
        System.out.println("Luong trung binh cua nhan vien la: " + (sum / nhanVienArray.length));

        int parttimeSum = 0;
        for (NhanVien nhanVien : nhanVienArray) {
            if (nhanVien instanceof NhanVienParttime) {
                parttimeSum += nhanVien.getIncome();
            }
        }
        System.out.println("Total parttime income: " + parttimeSum);

        System.out.println("danh sach nhan vien fulltime luong duoi muc trung binh la: ");
        for (NhanVien nhanVien : nhanVienArray) {
            if (nhanVien instanceof NhanVienFullTime) {
                if (nhanVien.getIncome() < averageIncome) {
                    System.out.println(nhanVien.getName());
                }
            }
        }


    }
}