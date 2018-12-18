package by.moiseenko.service;

import java.util.List;

import by.moiseenko.entity.Periodical;

public interface PeriodicalService {

    List<Periodical> getAllPeriodicals();

    void addPeriodical(Periodical periodical);

    void editPeriodicalById(Periodical periodical);

    void deletePeriodicalById(Periodical periodical);

    Periodical getPeriodicalById(int id);

}
