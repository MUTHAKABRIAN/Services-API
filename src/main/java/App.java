import Dao.Sql2oCategoriesDao;
import Dao.Sql2oCleanerDao;
import com.google.gson.Gson;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static spark.route.HttpMethod.get;

public class App {
    public static void main(String[] args) {
        Sql2oCategoriesDao categoriesDao;
        Sql2oCleanerDao cleanerDao;
        Connection conn;
        Gson gson = new Gson();

//        Initialize Development Database (h2)
        String connectionString = "jdbc:h2:~/services.db;INIT=RUNSCRIPT from 'classpath:DB/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");

        categoriesDao = new Sql2oCategoriesDao(sql2o);
        cleanerDao = new Sql2oCleanerDao(sql2o);
        conn = sql2o.open();


//        get("/categories", "application/json", (req, res) -> { //accept a request in format JSON from an app
//            System.out.println(categoriesDao.getAll());
//            return gson.toJson(categoriesDao.getAll());//send it back to be displayed
//        });
    }


}
