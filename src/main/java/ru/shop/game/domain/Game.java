package ru.shop.game.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String description;
    private double price;
    private int storage_count;

    public Game(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public Game() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStorage_count() {
        return storage_count;
    }

    public void setStorage_count(int storage_count) {
        this.storage_count = storage_count;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", storage_count=" + storage_count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Double.compare(game.price, price) == 0 &&
                storage_count == game.storage_count &&
                Objects.equals(id, game.id) &&
                Objects.equals(title, game.title) &&
                Objects.equals(description, game.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, price, storage_count);
    }
}