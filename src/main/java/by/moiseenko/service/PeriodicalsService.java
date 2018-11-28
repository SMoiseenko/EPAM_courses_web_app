package by.moiseenko.service;

import java.util.List;

import by.moiseenko.entity.Newspaper;

public interface PeriodicalsService {

    List<Newspaper> getAllNewspapers();

    void addNewspaper(Newspaper newspaper);

    Newspaper getNewspaperById(int id);

}
