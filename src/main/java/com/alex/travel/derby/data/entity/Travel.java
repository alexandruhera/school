package com.alex.travel.derby.data.entity;

import javax.persistence.Entity; // The API used for interaction with the database (PostgresDb)
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity()
public class Travel { // The travel class acts as a schema template for the "travel" table from postgresql db (via the @Entity() decorator), and it also defines the methods for CRUD operations, by means of get/set.
    @Id
    @GeneratedValue
    private Long id;
    private String imageUrl;
    private String travelText;
    private String title;
    private String price;
    private String descriptions;
    private String tags;

    public Travel(String imageUrl, String text, String title, String price, String descriptions, String tags) {
        this.imageUrl = imageUrl;
        this.travelText = text;
        this.title = title;
        this.price = price;
        this.descriptions = descriptions;
        this.tags = tags;
    }

    public Travel(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTravelText() {
        return travelText;
    }

    public void setTravelText(String travelText) {
        this.travelText = travelText;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {  // This ovverrides the "=" operator such that it is easier to identify entries of the "travel" tabel soly by their id
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Travel travel = (Travel) o;
        return Objects.equals(id, travel.id);
    }

    @Override
    public int hashCode() { // This ovverrid makes it easyer to get only the id's hash when calling the entier instance' hash
        return Objects.hash(id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
