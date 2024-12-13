public class Main {
    public static void main(String[] args) {
        ProgrammingBook pro1 = new ProgrammingBook(1, "sachPro1", 100, "son", "oidoioi", "python");
        ProgrammingBook pro2 = new ProgrammingBook(2, "sachPro2", 200, "son", "oidoioi", "JS");
        ProgrammingBook pro3 = new ProgrammingBook(3, "sachPro3", 300, "son", "oidoioi", "java");
        FictionBook fic1 = new FictionBook(11, "sachFic1", 50, "son", "fiction1");
        FictionBook fic2 = new FictionBook(22, "sachFic2", 45, "son", "fiction2");
        FictionBook fic3 = new FictionBook(33, "sachFic3", 250, "son", "fiction3");

        Book[] bookArray = {pro1, pro2, pro3, fic1, fic2, fic3};
        int sum = 0;
        for (Book book : bookArray) {
            sum += book.getPrice();
        }
        System.out.println(sum);

        int countJava = 0;
        for (Book b : bookArray) {
            if (b instanceof ProgrammingBook) {
                if ((((ProgrammingBook) b).getLanguage().equals("java"))) {
                    countJava++;
                }
            }
        }
        System.out.println(countJava);

    }
}






