package Dao;

import Models.categories;

import java.util.ArrayList;
import java.util.List;

public interface CategoriesDao {

    //categories
    void add(categories categories);

    //Read from categories
    ArrayList<categories> getAll();

    //Read specific category by name
    categories findCategoryByName(String category_name);

    //Delete a category over time
    void deleteByName(String category_name);

    //Clear all categories
    void clearAll(int category_id);
}
