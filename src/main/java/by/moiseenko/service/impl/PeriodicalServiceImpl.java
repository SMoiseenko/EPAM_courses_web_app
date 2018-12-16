package by.moiseenko.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.moiseenko.dao.PeriodicalDao;
import by.moiseenko.entity.periodical.Periodical;
import by.moiseenko.service.PeriodicalService;

@Service
public class PeriodicalServiceImpl implements PeriodicalService {

    private PeriodicalDao periodicalDao;

    @Autowired
    public PeriodicalServiceImpl(PeriodicalDao periodicalsDao) {
	super();
	this.periodicalDao = periodicalsDao;
    }

    @Override
    public List<Periodical> getAllPeriodicals() {
	return periodicalDao.getAllPeriodicals();
    }

    @Override
    public void addPeriodical(Periodical periodical) {
	periodicalDao.addPeriodical(periodical);
    }

    @Override
    public Periodical getPeriodicalById(int id) {
	return periodicalDao.getPeriodicalById(id);
    }

    @Override
    public void editPeriodical(Periodical periodical) {
	periodicalDao.editPeriodical(periodical);

    }

}
