import Dao.Sql2oCarpetCleanDao;
import Dao.Sql2oElectricianDao;
import Dao.Sql2oPaintDao;
import Dao.Sql2oPlumberDao;
import com.google.gson.Gson;
import org.sql2o.Sql2o;

import java.sql.Connection;

public class App {

    public static void main(String[] args) {

        Sql2oPlumberDao PlumberDao;
        Sql2oCarpetCleanDao CarpetCleanDao;
        Sql2oElectricianDao ElectricianDao;
        Sql2oPaintDao paintDao;

        Connection conn;
        Gson gson = new Gson();
        String connectionString = "jdbc:h2:~/services.db;INIT=RUNSCRIPT from 'classpath:DB/create.sql'";
        Sql2o sql2o =new Sql2o (connectionString, "","");

       paintDao =new Sql2oPaintDao(sql2o);
       CarpetCleanDao = new Sql2oCarpetCleanDao(sql2o);
       PlumberDao = new Sql2oPlumberDao(sql2o);

    }
}
