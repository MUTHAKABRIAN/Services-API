package Dao;

import Models.CarpetClean;

import java.util.List;

public interface CarpetCleanDao {
    void Add(CarpetClean carpetClean);
    List<CarpetClean> getAll();
    CarpetClean getCarpetCleanByName(String plumber_name);
    CarpetClean deleteByName(String plumber_name);
    void clearAll(int plumber_id);
}
