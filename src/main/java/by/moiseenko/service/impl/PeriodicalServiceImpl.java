package by.moiseenko.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.moiseenko.dao.PeriodicalDao;
import by.moiseenko.entity.Newspaper;
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
    public List<Newspaper> getAllNewspapers() {
	return periodicalDao.getAllNewspapers();
    }

    @Override
    public void addNewspaper(Newspaper newspaper) {
	periodicalDao.addNewspaper(newspaper);
    }

    @Override
    public Newspaper getNewspaperById(int id) {
	return periodicalDao.getNewspaperById(id);
    }

}
