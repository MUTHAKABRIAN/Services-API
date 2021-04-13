package Dao;

import Models.cleaner;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

public class Sql2oCleanerDao implements CleanerDao {
    private final Sql2o sql2o;

    public Sql2oCleanerDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(cleaner cleaner) {
        String sql = "INSERT INTO cleaner (cleanerId, cleaner_name, image, physical_address, phone_number, email, rating, description) VALUES (:cleanerId, :cleaner_name, :image, :physical_address, :phone_number, :email, :rating, :description);";
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
}
