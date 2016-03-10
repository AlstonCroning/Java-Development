package com.learning;

public class BookRack {
    private int numberOfBooks;
    private String book1,book2,book3,book4;

    public BookRack() {
        this.numberOfBooks = 4;
        this.book1 = "Harry Potter";
        this.book2 = "Lord of the Rings";
        this.book3 = "Kite Runner";
        this.book4 = "Treasure Hunters";
    }

    public void chooseBook(int chooseBook) {

        String book1,book2,book3,book4;

        switch (chooseBook) {
            case 1:
                book1 = this.book1;
                this.book1 = "The '" + book1 + "' book is not in the Rack";
                System.out.println("Book you Chose is 'Harry Potter'");
                break;

            case 2:
                book2 = this.book2;
                this.book2 = "The '" + book2 + "' book is not in the Rack";
                System.out.println("Book you Chose is 'Lord of the Rings'");
                break;

            case 3:
                book3 = this.book3;
                this.book3 = "The '" + book3 + "' book is not in the Rack";
                System.out.println("Book you Chose is 'Kite Runner'");
                break;

            case 4:
                book4 = this.book4;
                this.book4 = "The '" + book4 + "' book is not in the Rack";
                System.out.println("Book you Chose is 'Treasure Hunters'");
                break;

            default:
                System.out.println("No Books Chosen!!");
                break;
        }
    }

    //getters
    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public String getBook1() {
        return book1;
    }

    public String getBook2() {
        return book2;
    }

    public String getBook3() {
        return book3;
    }

    public String getBook4() {
        return book4;
    }
}
