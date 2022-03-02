package org.acme.kafka.model;

public class Form {

    public String id;
    public int price;

    public Form() {
    }

    public Form(String id, int price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Form{" +
                "id='" + id + '\'' +
                ", price=" + price +
                '}';
    }

}
