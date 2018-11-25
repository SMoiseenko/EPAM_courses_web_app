package by.moiseenko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.moiseenko.dao.PeriodicalsDao;
import by.moiseenko.entity.Newspaper;

@Service
public class NewspaperServiceImpl implements NewspaperService {

    @Autowired
    private PeriodicalsDao userDao;

    @Override
    public List<Newspaper> getAll() {

	return userDao.getAll();
    }

}
