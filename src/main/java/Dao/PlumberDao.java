package Dao;

import Models.Plumber;

import java.util.List;

public interface PlumberDao {

    void Add(Plumber plumber);
    List<Plumber>getAll();
    Plumber getPlumberByName(String plumber_name);
    Plumber deleteByName(String plumber_name);
    void clearAll(int plumber_id);


}
