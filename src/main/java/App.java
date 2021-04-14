import Dao.*;
import Models.Categories;
import Models.Cleaner;
import Models.Maid;
import Models.MovingHelp;
import com.google.gson.Gson;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import spark.Request;
import spark.Response;
import spark.route.HttpMethod;

import java.sql.DriverManager;
import java.sql.SQLException;

import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.get;
import static spark.route.HttpMethod.get;

public class App {
    public static void main(String[] args) throws SQLException {
        Sql2oCategoriesDao categoriesDao;
        Sql2oCleanerDao cleanerDao;
        Sql2oMaidDao maidDao;
        Sql2oMovingDao movingDao;
        Connection conn;
        Gson gson = new Gson();

//        Initialize Development Database (h2)
        String connectionString = "jdbc:h2:~/services.db;INIT=RUNSCRIPT from 'classpath:DB/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");

//        DriverManager.getConnection("jdbc:h2:tcp://localhost/server~/services", "", "");

        categoriesDao = new Sql2oCategoriesDao(sql2o);
        cleanerDao = new Sql2oCleanerDao(sql2o);
        maidDao = new Sql2oMaidDao(sql2o);
        movingDao = new Sql2oMovingDao(sql2o);
        conn = sql2o.open();

        port(6060);


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

        post("moving_help/new", "application/json", (request, response) -> {
            MovingHelp movingHelp = gson.fromJson(request.body(), MovingHelp.class);
            movingDao.add(movingHelp);
            response.status(201);
            return gson.toJson(movingHelp);
        });

        //Request for access of data in tables
        get("/cleaner", "application/json", ((request, response) -> {
            System.out.println(cleanerDao.getAll());
            return gson.toJson(cleanerDao.getAll());
        }));

        get("/maid", "application/json", ((request, response) -> {
            System.out.println(maidDao.getAll());
            return gson.toJson(maidDao.getAll());
        }));

        get("/moving_help", "application/json", ((request, response) -> {
            System.out.println(movingDao.getAll());
            return gson.toJson(movingDao.getAll());
        }));

        //get specific cleaner by name.
    }


}
