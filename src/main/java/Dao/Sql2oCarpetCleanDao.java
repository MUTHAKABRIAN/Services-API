package Dao;

import Models.CarpetClean;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oCarpetCleanDao implements CarpetCleanDao {

    private final Sql2o sql2o;
    public Sql2oCarpetCleanDao(Sql2o sql2o) {
        this.sql2o = sql2o;

    }

    @Override
    public void Add(CarpetClean carpetClean) {
        String sql = "INSERT INTO carpet_clean(ccId, cc_name,image,physical_address,email,rating, description) VALUES (:ccId, :cc_name,:image,:physical_address,:email,:rating, :description)";
        try (Connection conn = sql2o.open()) {
            int id = (int) conn.createQuery(sql, true)
                    .bind(carpetClean)
                    .executeUpdate()
                    .getKey();
            carpetClean.setCcId(id);

        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }



    @Override
    public List<CarpetClean> getAll() {
        try (Connection conn = sql2o.open()) {
            System.out.println(conn.createQuery("SELECT * FROM carpet_clean")
                    .executeAndFetch(CarpetClean.class));
            return conn.createQuery("SELECT * FROM carpet_clean")
                    .executeAndFetch(CarpetClean.class);

        }
    }

    @Override
    public CarpetClean getCarpetCleanByName(String cc_name) {
        String sql = "SELECT * FROM carpet_clean WHERE cc_name = :cc_name";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sql)
                    .addParameter("name", cc_name)
                    .executeAndFetchFirst(CarpetClean.class);
        }

    }

    @Override
    public CarpetClean deleteByName(String plumber_name) {
        return null;
    }

    @Override
    public void clearAll(int cc_id) {

        String deleteCarpetClean= "DELETE FROM plumber WHERE ccId = :ccId";
        try (Connection conn = sql2o.open()) {
            conn.createQuery(deleteCarpetClean)
                    .addParameter("ccId", cc_id)
                    .executeUpdate();
        } catch (Sql2oException clear) {
            System.out.println(clear);

        }
    }
}
