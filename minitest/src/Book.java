

    public class Book{
        int bookCode;
        String name;
        int price;
        String author;

        public Book(int bookCode, String name, int price, String author) {
            this.bookCode = bookCode;
            this.name = name;
            this.price = price;
            this.author = author;
        }

        public int getBookCode() {
            return bookCode;
        }

        public int getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }

        public String getAuthor() {
            return author;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }


