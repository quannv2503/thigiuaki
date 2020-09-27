package model;

public class Product implements Comparable<Product> {
    private String name;
    private long price;
    private int id;

    public Product() {
    }

    public Product(String name, long price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", productCode=" + id +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.price == o.price) {
            return o.name.compareTo(this.name);
        }
        return Long.compare(this.price, o.price);
    }
}
