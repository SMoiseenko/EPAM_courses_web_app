package by.moiseenko.dao;

import java.util.List;

import by.moiseenko.entity.Newspaper;

public interface PeriodicalDao {

    List<Newspaper> getAllNewspapers();

    Newspaper getNewspaperById(int id);

    void addNewspaper(Newspaper newspaper);

    void editNewspaper(Newspaper newspaper);

    void deleteNewspaper(Newspaper newspaper);

}
