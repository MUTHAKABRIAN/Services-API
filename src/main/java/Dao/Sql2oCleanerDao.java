package Dao;

import Models.Cleaner;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oCleanerDao implements CleanerDao {
    private final Sql2o sql2o;

    public Sql2oCleanerDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Cleaner cleaner) {
        String sql = "INSERT INTO cleaner ( cleaner_name, image, physical_address, phone_number, email, rating, description) VALUES (:cleanerId, :cleaner_name, :image, :physical_address, :phone_number, :email, :rating, :description);";
        try (Connection connection = sql2o.open()) {
            int cleanerId = (int) connection.createQuery(sql, true)
                    .bind(cleaner)
                    .executeUpdate()
                    .getKey();
            cleaner.setCleanerId(cleanerId);
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public List<Cleaner> getAll() {
        try (Connection connection = sql2o.open()) {
            System.out.println(connection.createQuery("SELECT * FROM cleaner")
                    .executeAndFetch(Cleaner.class));
            return connection.createQuery("SELECT * FROM cleaner")
                    .executeAndFetch(Cleaner.class);
        }
    }
}
