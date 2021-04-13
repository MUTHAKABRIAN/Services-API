package Dao;

import Models.Cleaner;

import java.util.List;

public interface CleanerDao {

    //cleaners
    void add(Cleaner cleaner);

    //Read from the list of maids
    List<Cleaner> getAll();
}
