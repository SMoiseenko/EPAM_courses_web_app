package by.moiseenko.service;

import java.util.List;

import by.moiseenko.entity.periodical.Periodical;

public interface PeriodicalService {

    List<Periodical> getAllPeriodicals();

    void addPeriodical(Periodical periodical);

    void editPeriodical(Periodical periodical);

    Periodical getPeriodicalById(int id);

}
