import org.json.JSONObject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class ProductMgmtApp {


    public static Product[] ProdArr = {new Product("Banana", 3128874119L, LocalDate.of(2023, 01, 24), 124, 0.55f),
            new Product("Apple", 2927458265L, LocalDate.of(2022, 12, 9), 19, 1.09f),
            new Product("Carrot", 9189927460L, LocalDate.of(2023, 03, 31), 89, 2.99f)};

    public void printProducts(Product[] list) {

        Arrays.sort(list, (p1, p2) -> p1.getName().compareTo(p2.getName()));


        System.out.println("JSON Format");
        for (Product item : list) {
            JSONObject json = new JSONObject();
            json.put("productId", item.getProductId());
            json.put("name", item.getName());
            json.put("dateSupplied", item.getDateSupplied());
            json.put("quantityInStock", item.getQuantityInStock());
            json.put("unitPrice", item.getUnitPrice());
            System.out.println(json);

        }
        System.out.println("XML Format");
        System.out.println("<Products>");
        for (Product product : list) {
            System.out.println("\t<Product>");
            System.out.println("\t\t<Name>" + product.getName() + "</Name>");
            System.out.println("\t\t<ProductId>" + product.getProductId() + "</ProductId>");
            System.out.println("\t\t<UnitPrice>" + product.getUnitPrice() + "</UnitPrice>");
            System.out.println("\t\t<DateSupplied>" + product.getDateSupplied() + "</DateSupplied>");
            System.out.println("\t\t<QuantityInStock>" + product.getQuantityInStock() + "</QuantityInStock>");
            System.out.println("\t</Product>");
        }
        System.out.println("</Products>");


        System.out.println("CSV format:");
        System.out.println("Name,ProductId,UnitPrice,DateSupplied,QuantityInStock");
        for (Product product : list) {
            System.out.println(product.getName() + "," + product.getProductId() +"," + product.getUnitPrice()+"," + product.getDateSupplied()+"," + product.getDateSupplied() +"," + product.getQuantityInStock());
        }
    }

    public static void main(String[] args) {
        ProductMgmtApp obj = new ProductMgmtApp();
        obj.printProducts(ProdArr);
    }
}
