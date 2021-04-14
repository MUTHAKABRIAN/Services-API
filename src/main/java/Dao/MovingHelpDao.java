package Dao;

import Models.MovingHelp;

import java.util.List;

public interface MovingHelpDao {
    void add(MovingHelp movingHelp);

    List<MovingHelp> getAll();
}
