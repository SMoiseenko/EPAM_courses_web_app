package by.moiseenko.dao;

import java.util.List;

import by.moiseenko.entity.Newspaper;

public interface PeriodicalsDao {

    List<Newspaper> getAll();

    void add(Newspaper newspaper);

}
