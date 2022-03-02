package org.acme.kafka.model;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
public class Quote {

    public String id;
    public int price;
    @Column(name = "currenttime", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Generated(GenerationTime.ALWAYS)
    public Timestamp createTime = Timestamp.valueOf(LocalDateTime.now());

    public Quote() {
    }

    public Quote(String id, int price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id='" + id + '\'' +
                ", price=" + price +
                '}';
    }

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

}