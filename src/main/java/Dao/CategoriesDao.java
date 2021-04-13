package Dao;

import Models.Categories;

import java.util.ArrayList;

public interface CategoriesDao {

    //categories
    void add(Categories categories);

    //Read from categories
    ArrayList<Categories> getAll();

    //Read specific category by name
    Categories findCategoryByName(String category_name);

    //Delete a category over time
    void deleteByName(String category_name);

    //Clear all categories
    void clearAll(int category_id);
}
