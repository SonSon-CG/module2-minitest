public class Main {
    public static void main(String[] args) {
        ProgrammingBook pro1 = new ProgrammingBook(1, "sachPro1", 100, "son", "oidoioi", "python");
        ProgrammingBook pro2 = new ProgrammingBook(2, "sachPro2", 200, "son", "oidoioi", "JS");
        ProgrammingBook pro3 = new ProgrammingBook(3, "sachPro3", 300, "son", "oidoioi", "java");
        FictionBook fic1 = new FictionBook(11, "sachFic1", 50, "son", "fiction1");
        FictionBook fic2 = new FictionBook(22, "sachFic2", 45, "son", "fiction2");
        FictionBook fic3 = new FictionBook(33, "sachFic3", 250, "son", "fiction3");
        int[] bookArray = new int[6];
        bookArray[0] = pro1.getPrice();
        bookArray[1] = pro2.getPrice();
        bookArray[2] = pro3.getPrice();
        bookArray[3] = fic1.getPrice();
        bookArray[4] = fic2.getPrice();
        bookArray[5] = fic3.getPrice();

        int totalPrice = 0;
        for (int i = 0; i < bookArray.length; i++) {
            totalPrice += bookArray[i];
        }
        System.out.println("tong tien la: " + totalPrice);

        String[] languageArray = new String[3];
        languageArray[0] = pro1.getLanguage();
        languageArray[1] = pro2.getLanguage();
        languageArray[2] = pro3.getLanguage();
        int javaLanguageCount = 0;
        for (int i = 0; i < languageArray.length; i++) {
            if (languageArray[i].equals("java")) {
                javaLanguageCount++;
            }
        }
        System.out.println("so cuon sach language Java la: " + javaLanguageCount);

        String[] categoryArray = new String[3];
        categoryArray[0] = fic1.getCategory();
        categoryArray[1] = fic2.getCategory();
        categoryArray[2] = fic3.getCategory();
        int fiction1CategoryCount = 0;
        for (int i = 0; i < categoryArray.length; i++) {
            if (categoryArray[i].equals("fiction1")) {
                fiction1CategoryCount++;
            }
        }
        System.out.println("so sach fiction1 la: " + fiction1CategoryCount);

        int[] priceArray = new int[3];
        priceArray[0] = fic1.getPrice();
        priceArray[1] = fic2.getPrice();
        priceArray[2] = fic3.getPrice();
        int count = 0;
        for (int i = 0; i < priceArray.length; i++) {
            if (priceArray[i] < 100) {
                count++;
            }
        }
        System.out.println("so sach Fiction gia < 100 la: " + count);


    }
}