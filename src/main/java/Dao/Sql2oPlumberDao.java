package Dao;

import Models.Plumber;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oPlumberDao implements PlumberDao {

    private final Sql2o sql2o;

    public Sql2oPlumberDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void Add(Plumber plumber) {
        String sql = "INSERT INTO plumber (plumberId, plumber_name,image,physical_address,email,rating, description) VALUES (:plumberId, :plumber_name,:image,:physical_address,:email,:rating, :description)";
        try (Connection conn = sql2o.open()) {
            int id = (int) conn.createQuery(sql, true)
                    .bind(plumber)
                    .executeUpdate()
                    .getKey();
            plumber.setPlumberId(id);

        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }


    @Override
    public List<Plumber> getAll() {
        try (Connection conn = sql2o.open()) {
            System.out.println(conn.createQuery("SELECT * FROM plumber")
                    .executeAndFetch(Plumber.class));
            return conn.createQuery("SELECT * FROM plumber")
                    .executeAndFetch(Plumber.class);

        }
    }

    @Override
    public Plumber getPlumberByName(String plumber_name) {
        String sql = "SELECT * FROM department WHERE plumber_name = :plumber_name";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sql)
                    .addParameter("name", plumber_name)
                    .executeAndFetchFirst(Plumber.class);
        }

    }

    @Override
    public Plumber deleteByName(String plumber_name) {
        return null;
    }

    @Override
    public void clearAll(int plumber_id) {
        String deletePlumber = "DELETE FROM plumber WHERE plumberId = :plumberId";
        try (Connection conn = sql2o.open()) {
            conn.createQuery(deletePlumber)
                    .addParameter("plumberId", plumber_id)
                    .executeUpdate();
        } catch (Sql2oException clear) {
            System.out.println(clear);

        }
    }
}

