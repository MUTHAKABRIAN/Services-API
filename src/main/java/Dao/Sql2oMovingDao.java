package Dao;

import Models.MovingHelp;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oMovingDao implements MovingHelpDao {
    private final Sql2o sql2o;

    public Sql2oMovingDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(MovingHelp movingHelp) {
        String sql = "INSERT INTO moving_help(mover_name, image, physical_address, phone_number, email, rating, description) VALUES (:mover_name, :image, :physical_address, :phone_number, :email, :rating, :description);";
        try (Connection connection = sql2o.open()) {
            int moverId = (int) connection.createQuery(sql, true)
                    .bind(movingHelp)
                    .executeUpdate()
                    .getKey();
            movingHelp.setMoverId(moverId);
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
     }

    @Override
    public List<MovingHelp> getAll() {
        try (Connection connection = sql2o.open()) {
            System.out.println(connection.createQuery("SELECT * FROM moving_help")
                    .executeAndFetch(MovingHelp.class));
            return connection.createQuery("SELECT * FROM moving_help")
                    .executeAndFetch(MovingHelp.class);
        }
    }
}
