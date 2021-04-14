package Dao;

import Models.Paint;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oPaintDao implements paintDao {
    private final Sql2o sql2o;

    public Sql2oPaintDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void Add(Paint paint) {
        String sql = "INSERT INTO electrician (painter_name,image,physical_address,email,rating, description) VALUES (:painter_name,:image,:physical_address,:email,:rating, :description)";
        try (Connection conn = sql2o.open()) {
            int id = (int) conn.createQuery(sql, true)
                    .bind(paint)
                    .executeUpdate()
                    .getKey();
            paint.setPainterId(id);

        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }


    @Override
    public List<Paint> getAll() {
        try (Connection conn = sql2o.open()) {
            System.out.println(conn.createQuery("SELECT * FROM paint")
                    .executeAndFetch(Paint.class));
            return conn.createQuery("SELECT * FROM paint")
                    .executeAndFetch(Paint.class);

        }
    }

    @Override
    public Paint getPainterByName(String painter_name) {
        String sql = "SELECT * FROM paint WHERE painter_name = :painter_name";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sql)
                    .addParameter("name", painter_name)
                    .executeAndFetchFirst(Paint.class);
        }

    }

    @Override
    public Paint deleteByName(String painter_name) {
        return null;
    }

    @Override
    public void clearAll(int painter_id) {
        String deleteCarpetClean= "DELETE FROM paint WHERE painter_id = :painter_id";
        try (Connection conn = sql2o.open()) {
            conn.createQuery(deleteCarpetClean)
                    .addParameter("painterId", painter_id)
                    .executeUpdate();
        } catch (Sql2oException clear) {
            System.out.println(clear);

        }
    }
}
