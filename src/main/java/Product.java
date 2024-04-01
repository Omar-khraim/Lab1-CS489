import java.time.LocalDate;
import java.time.LocalDateTime;

public class Product {

    // Attributes
    long productId;
    String name;
    LocalDate dateSupplied;
    int quantityInStock;
    float unitPrice;

    //Constructors

    Product(){}
    Product(String name, long productId ){
        this.name = name;
        this.productId = productId;
    }
    Product(String name, long productId , LocalDate dateSupplied, int quantityInStock,float unitPrice ){
        this.dateSupplied = dateSupplied;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
        this.name = name;
        this.productId = productId;
    }


    //Setter && Getter
    public String getName() {
        return name;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public LocalDate getDateSupplied() {
        return dateSupplied;
    }

    public long getProductId() {
        return productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateSupplied(LocalDate dateSupplied) {
        this.dateSupplied = dateSupplied;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
}
