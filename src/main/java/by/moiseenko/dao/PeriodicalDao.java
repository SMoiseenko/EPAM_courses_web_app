package by.moiseenko.dao;

import java.util.List;

import by.moiseenko.entity.Periodical;

public interface PeriodicalDao {

    List<Periodical> getAllPeriodicals();

    Periodical getPeriodicalById(int id);

    void addPeriodical(Periodical periodical);

    void editPeriodicalById(Periodical periodical);

    void deletePeriodicalById(Periodical periodical);

}
