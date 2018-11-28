package by.moiseenko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.moiseenko.dao.PeriodicalsDao;
import by.moiseenko.entity.Newspaper;

@Service
public class PeriodicalsServiceImpl implements PeriodicalsService {

    @Autowired
    private PeriodicalsDao periodicalsDao;

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
	return	periodicalsDao.getNewspaperById(id);
	
    }
    
    

}
