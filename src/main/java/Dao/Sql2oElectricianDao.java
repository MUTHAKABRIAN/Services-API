package Dao;

import Models.Electrician;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oElectricianDao implements ElectricianDao {

    private final Sql2o sql2o;

    public Sql2oElectricianDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }


    @Override
    public void Add(Electrician electrician) {
        String sql = "INSERT INTO electrician (electrician_name,image,physical_address,email,rating, description) VALUES (:electrician_name,:image,:physical_address,:email,:rating, :description)";
        try (Connection conn = sql2o.open()) {
            int electricianId = (int) conn.createQuery(sql, true)
                    .bind(electrician)
                    .executeUpdate()
                    .getKey();
            electrician.setElectricianId(electricianId);
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public List<Electrician> getAll() {
        try (Connection conn = sql2o.open()) {
            System.out.println(conn.createQuery("SELECT * FROM electrician")
                    .executeAndFetch(Electrician.class));
            return conn.createQuery("SELECT * FROM electrician")
                    .executeAndFetch(Electrician.class);

        }
    }

    @Override
    public Electrician getPlumberByName(String electrician_name) {
        String sql = "SELECT * FROM department WHERE electrician_name = :electrician_name";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sql)
                    .addParameter("name", electrician_name)
                    .executeAndFetchFirst(Electrician.class);
        }

    }


    @Override
    public Electrician deleteByName(String electrician_name) {
        return null;
    }

    @Override
    public void clearAll(int Electrician_id) {
        String deleteElectrician = "DELETE FROM plumber WHERE electricianId = :electricianId";
        try (Connection conn = sql2o.open()) {
            conn.createQuery(deleteElectrician)
                    .addParameter("electricianId", Electrician_id)
                    .executeUpdate();
        } catch (Sql2oException clear) {
            System.out.println(clear);

        }
    }

}
