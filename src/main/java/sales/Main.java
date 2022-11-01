package sales;

import jakarta.persistence.Persistence;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var salesEM =
                Persistence.createEntityManagerFactory("sales").createEntityManager();
        var product = new Product("productA", 1,new BigDecimal("1"));
        var customer = new Customer("customer","customer@email.org","ACC20424AD");
        var storeLocation = new StoreLocation("location");
        var sale = new Sale(product, customer, storeLocation, LocalDate.now());
        salesEM.getTransaction().begin();
        salesEM.persist(product);
        salesEM.persist(customer);
        salesEM.persist(storeLocation);
        salesEM.persist(sale);
        salesEM.getTransaction().commit();
        salesEM.close();
    }
}
