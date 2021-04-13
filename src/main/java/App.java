import Dao.*;
import Models.Categories;
import Models.Cleaner;
import Models.Maid;
import com.google.gson.Gson;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import Dao.Sql2oCarpetCleanDao;
import Dao.Sql2oElectricianDao;
import Dao.Sql2oPaintDao;
import Dao.Sql2oPlumberDao;
import spark.Request;
import spark.Response;
import spark.route.HttpMethod;

import java.sql.DriverManager;
import java.sql.SQLException;

import static spark.Spark.port;
import static spark.Spark.post;
import static spark.route.HttpMethod.get;

public class App {
    public static void main(String[] args) throws SQLException {
        Sql2oCategoriesDao categoriesDao;
        Sql2oCleanerDao cleanerDao;
        Sql2oMaidDao maidDao;
        Sql2oPlumberDao PlumberDao;
        Sql2oCarpetCleanDao CarpetCleanDao;
        Sql2oElectricianDao ElectricianDao;
        Sql2oPaintDao paintDao;
      
      
        paintDao =new Sql2oPaintDao(sql2o);
       CarpetCleanDao = new Sql2oCarpetCleanDao(sql2o);
       PlumberDao = new Sql2oPlumberDao(sql2o);
        Connection conn;
        Gson gson = new Gson();

//        Initialize Development Database (h2)
        String connectionString = "jdbc:h2:~/services.db;INIT=RUNSCRIPT from 'classpath:DB/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");

//        DriverManager.getConnection("jdbc:h2:tcp://localhost/server~/services", "", "");

        categoriesDao = new Sql2oCategoriesDao(sql2o);
        cleanerDao = new Sql2oCleanerDao(sql2o);
        maidDao = new Sql2oMaidDao(sql2o);
        conn = sql2o.open();

        port(7070);


        //New data entry in cleaners table in DB
        post("cleaner/new", "application/json", (request, response) -> {
            Cleaner cleaner = gson.fromJson(request.body(), Cleaner.class);
            cleanerDao.add(cleaner);
            response.status(201);
            return gson.toJson(cleaner);
        });

        //New data entry in maid table in DB
        post("maid/new", "application/json", (request, response) -> {
            Maid maid = gson.fromJson(request.body(), Maid.class);
            maidDao.add(maid);
            response.status(201);
            return gson.toJson(maid);
        });

        //Request for access of data in tables
//        get("/cleaner", "application/json", ((request, response) -> {
//            System.out.println(cleanerDao.getAll());
//            return gson.toJson(cleanerDao.getAll());
//        }));
//
//        get("/maid", "application/json", ((request, response) -> {
//            System.out.println(maidDao.getAll());
//            return gson.toJson(maidDao.getAll());
//        }));


    }


}
