import Dao.Sql2oCarpetCleanDao;
import Dao.Sql2oElectricianDao;
import Dao.Sql2oPaintDao;
import Dao.Sql2oPlumberDao;
import com.google.gson.Gson;
import org.sql2o.Sql2o;

import java.sql.Connection;

import static spark.Spark.port;
import static spark.Spark.staticFileLocation;

public class App {
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }

    public static void main(String[] args) {
        port(getHerokuAssignedPort());
        staticFileLocation("/public");

        Sql2oPlumberDao PlumberDao;
        Sql2oCarpetCleanDao CarpetCleanDao;
        Sql2oElectricianDao ElectricianDao;
        Sql2oPaintDao paintDao;

        Connection conn;
        Gson gson = new Gson();
        String connectionString = "jdbc:h2:~/news_org.db;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o =new Sql2o (connectionString, "legit","Access");

       paintDao =new Sql2oPaintDao(sql2o);
       CarpetCleanDao = new Sql2oCarpetCleanDao(sql2o);
       PlumberDao = new Sql2oPlumberDao(sql2o);






    }
}
