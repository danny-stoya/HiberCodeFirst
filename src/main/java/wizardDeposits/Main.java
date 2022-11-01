package wizardDeposits;

import jakarta.persistence.Persistence;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var wizardEm =
                Persistence.createEntityManagerFactory("gringotts", Map.of("root", "Nopasshere")).createEntityManager();
        var wizard = new WizardDeposit("fname", "lname", 1, "wand", 1, "depGroup");
        wizardEm.getTransaction().begin();
        wizardEm.persist(wizard);
        wizardEm.getTransaction().commit();
        wizardEm.close();
    }
}
