package by.moiseenko.service;

import java.util.List;

import by.moiseenko.entity.Newspaper;

public interface PeriodicalsService {

    List<Newspaper> getAll();

    void add(Newspaper newspaper);

}
