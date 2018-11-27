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
    public List<Newspaper> getAll() {

	return periodicalsDao.getAll();
    }

    @Override
    public void add(Newspaper newspaper) {
	
	periodicalsDao.add(newspaper);
	
    }
    
    

}
