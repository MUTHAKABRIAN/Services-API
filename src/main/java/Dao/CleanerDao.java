package Dao;

import Models.Cleaner;

import java.util.List;

public interface CleanerDao {

    //cleaners
    void add(Cleaner cleaner);

    //Read from the list of maids
    List<Cleaner> getAll();

    //Read specific cleaner by name
//    Cleaner findCleanerByName(String cleaner_name);

    //Delete a cleaner by name from DB
    void deleteByName(String cleaner_name);

    //Clear all cleaners from DB
    void clearAll(int cleanerId);
}
