package Dao;

import Models.Maid;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oMaidDao implements MaidDao {
    private final Sql2o sql2o;

    public Sql2oMaidDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Maid maid) {
        String sql = "INSERT INTO maid (maid_name, image, physical_address, phone_number, email, rating, description) VALUES (:maid_name, :image, :physical_address, :phone_number, :email, :rating, :description);";
        try (Connection conn = sql2o.open()) {
            int maidId = (int) conn.createQuery(sql, true)
                    .bind(maid)
                    .executeUpdate()
                    .getKey();
            maid.setMaidId(maidId);
        } catch (Sql2oException error) {
            System.out.println(error);
        }
    }

    @Override
    public List<Maid> getAll() {
        try (Connection conn = sql2o.open()) {
            System.out.println(conn.createQuery("SELECT * FROM maid")
                    .executeAndFetch(Maid.class));
            return conn.createQuery("SELECT * FROM maid")
                    .executeAndFetch(Maid.class);
        }
    }
}
