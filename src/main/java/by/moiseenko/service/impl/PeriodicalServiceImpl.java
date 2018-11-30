package by.moiseenko.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.moiseenko.dao.PeriodicalsDao;
import by.moiseenko.entity.Newspaper;
import by.moiseenko.service.PeriodicalService;

@Service
public class PeriodicalServiceImpl implements PeriodicalService {

    private PeriodicalsDao periodicalsDao;

    @Autowired
    public PeriodicalServiceImpl(PeriodicalsDao periodicalsDao) {
	super();
	this.periodicalsDao = periodicalsDao;
    }

    @Override
    public List<Newspaper> getAllNewspapers() {
	return periodicalsDao.getAllNewspapers();
    }

    @Override
    public void addNewspaper(Newspaper newspaper) {
	periodicalsDao.addNewspaper(newspaper);
    }

    @Override
    public Newspaper getNewspaperById(int id) {
	return periodicalsDao.getNewspaperById(id);
    }

}
