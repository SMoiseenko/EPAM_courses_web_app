package by.moiseenko.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import by.moiseenko.dao.PeriodicalDao;
import by.moiseenko.entity.Newspaper;
import by.moiseenko.mapper.NewspaperMapper;

@Repository
public class PeriodicalDaoImpl implements PeriodicalDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public PeriodicalDaoImpl(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Newspaper> getAllNewspapers() {
	String sql = "SELECT * FROM newspapers";
	return jdbcTemplate.query(sql, new NewspaperMapper());
    }

    @Override
    public void addNewspaper(Newspaper newspaper) {
	String sql = "INSERT INTO newspapers (ISSN, title, description, qty_per_year, price) VALUE (?, ?, ?, ?, ?)";
	jdbcTemplate.update(sql, newspaper.getIssn(), newspaper.getTitle(), newspaper.getDescription(),
		newspaper.getQtyPerYear(), newspaper.getPrice());

    }

    @Override
    public void editNewspaper(Newspaper newspaper) {
	// TODO Auto-generated method stub

    }

    @Override
    public void deleteNewspaper(Newspaper newspaper) {
	// TODO Auto-generated method stub

    }

    @Override
    public Newspaper getNewspaperById(int id) {
	String sql = "SELECT * FROM newspapers WHERE id=?";
	return jdbcTemplate.queryForObject(sql, new Object[] { id }, new NewspaperMapper());
    }

}
