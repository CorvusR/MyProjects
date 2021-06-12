package beans;

import org.springframework.stereotype.Component;

import java.util.Objects;
@Component
public class Books {
    private int id;
    private String name;
    private int price;
    private String detail;

    public Books() {
    }

    public Books(int id, String name, int price, String detail) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return id == books.id && price == books.price && Objects.equals(name, books.name) && Objects.equals(detail, books.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, detail);
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", detail='" + detail + '\'' +
                '}';
    }
}
