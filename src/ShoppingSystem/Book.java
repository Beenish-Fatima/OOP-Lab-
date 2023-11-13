package ShoppingSystem;

import java.util.Arrays;

public class Book extends Product {
    private String author;
    private String publisher;
    private ShoppingCart shoppingCart;
    private Order[] items;

    public Book() {

    }

    public Book(int productId, String name, double price, String author, String publisher, ShoppingCart shoppingCart, Order[] items) {
        super(productId, name, price);
        this.author = author;
        this.publisher = publisher;
        this.shoppingCart = shoppingCart;
        this.items = items;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public Order[] getItems() {
        return items;
    }

    public void setItems(Order[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", shoppingCart=" + shoppingCart +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}

