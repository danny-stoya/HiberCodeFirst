import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import salesDB.Product;
import salesDB.Sale;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        EntityManager em = Persistence
                .createEntityManagerFactory("PU")
                .createEntityManager();
        em.getTransaction().begin();
        var product = new Product("chushki", 24, BigDecimal.TEN);
        var sale = new Sale();
        sale.setProduct(product);
        em.persist(sale);
        em.persist(product);
        em.getTransaction().commit();
        em.close();
    }
}
