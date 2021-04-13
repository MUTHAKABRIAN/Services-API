package Dao;

import Models.Electrician;

import java.util.List;

public interface ElectricianDao {
    void Add(Electrician electrician);
    List<Electrician> getAll();
    Electrician getPlumberByName(String electrician_name);
    Electrician deleteByName(String electrician_name);
    void clearAll(int Electrician_id);
}
