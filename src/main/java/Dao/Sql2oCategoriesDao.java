package Dao;

import Models.categories;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.ArrayList;

public class Sql2oCategoriesDao implements CategoriesDao {
    private final Sql2o sql2o;

    public Sql2oCategoriesDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(categories categories) {
        String category = "INSERT INTO categories (home_cleaning, maid_services, mover_services, plumbing, electrician, carpet_cleaning, paint_man) VALUES (:home_cleaning, :maid_services, :mover_services, :plumbing, :electrician, :carpet_cleaning, :paint_man);"; //REMEMBER TO ALTER HERE AFTER ALTERATION ON THE TABLES
        try (Connection conn = sql2o.open()) {
            int categoryId = (int) conn.createQuery(category, true)
                    .bind(categories)
                    .executeUpdate()
                    .getKey();
            categories.setCategoryId(categoryId);
        } catch (Sql2oException error) {
            System.out.println(error);
        }
    }

    @Override
    public ArrayList<categories> getAll() {
        try (Connection conn = sql2o.open()) {
            return (ArrayList<categories>) conn.createQuery("SELECT * FROM categories")
                    .executeAndFetch(categories.class);
        }
    }

    @Override
    public categories findCategoryByName(String category_name) {
        return null;
    }

    @Override
    public void deleteByName(String category_name) {

    }


    @Override
    public void clearAll(int category_id) {
        String deleteCategory = "DELETE FROM categories WHERE categoryId = :categoryId";
        try (Connection conn = sql2o.open()) {
            conn.createQuery(deleteCategory)
                    .addParameter("categoryId", category_id)
                    .executeUpdate();
        } catch (Sql2oException clear) {
            System.out.println(clear);
        }
    }
}
