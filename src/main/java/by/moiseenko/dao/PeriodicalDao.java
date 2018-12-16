package by.moiseenko.dao;

import java.util.List;

import by.moiseenko.entity.periodical.Periodical;

public interface PeriodicalDao {

    List<Periodical> getAllPeriodicals();

    Periodical getPeriodicalById(int id);

    void addPeriodical(Periodical periodical);

    void editPeriodical(Periodical periodical);

    void deletePeriodical(Periodical periodical);

}
