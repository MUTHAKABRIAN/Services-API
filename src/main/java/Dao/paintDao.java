package Dao;

import Models.Paint;

import java.util.List;

public interface paintDao {
    void Add(Paint paint);
    List<Paint> getAll();
    Paint getPainterByName(String painter_name);
    Paint deleteByName(String painter_name);
    void clearAll(int painter_id);
}
