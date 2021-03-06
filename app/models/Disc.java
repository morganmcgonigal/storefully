package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.text.NumberFormat;

@Entity
public class Disc {

    @Id
    private int discId;

    private String discName;
    private BigDecimal discPrice;
    private int discTypeId;
    private int discGenreId;
    private int retailerId;
    private int bookshelfId;
    private BigDecimal faceValue;

    public int getDiscId() {
        return discId;
    }

    public void setDiscId(int discId) {
        this.discId = discId;
    }

    public String getDiscName() {
        return discName;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public BigDecimal getDiscPrice() {
        return discPrice;
    }

    public void setDiscPrice(BigDecimal discPrice) {
        this.discPrice = discPrice;
    }

    public String getFormattedDiscPrice(){
        return NumberFormat.getCurrencyInstance().format(discPrice);
    }

    public int getDiscTypeId() {
        return discTypeId;
    }

    public void setDiscTypeId(int discTypeId) {
        this.discTypeId = discTypeId;
    }

    public int getDiscGenreId() {
        return discGenreId;
    }

    public void setDiscGenreId(int discGenreId) {
        this.discGenreId = discGenreId;
    }

    public int getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(int retailerId) {
        this.retailerId = retailerId;
    }

    public int getBookshelfId() {
        return bookshelfId;
    }

    public void setBookshelfId(int bookshelfId) {
        this.bookshelfId = bookshelfId;
    }

    public BigDecimal getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(BigDecimal faceValue) {
        this.faceValue = faceValue;
    }
}
