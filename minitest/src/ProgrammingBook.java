public class ProgrammingBook extends Book {
    String language;
    String framework;

    public ProgrammingBook(int bookCode, String name, int price, String author, String framework, String language) {
        super(bookCode, name, price, author);
        this.framework = framework;
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public String getFramework() {
        return framework;
    }

    @Override
    public int getPrice() {
        return super.getPrice()*95/100;
    }
}
