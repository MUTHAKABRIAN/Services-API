package Dao;

import Models.Maid;

import java.util.List;

public interface MaidDao {

    //Add new maid to a list
    void add(Maid maid);

    //Read from the list of maids
    List<Maid> getAll();
}
