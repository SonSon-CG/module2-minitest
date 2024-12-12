public class FictionBook extends Book {
    String category;

    public FictionBook(int bookCode, String name, int price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public int getPrice() {
        return super.getPrice()*93/100;
    }
}

