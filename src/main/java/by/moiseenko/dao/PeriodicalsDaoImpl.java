package by.moiseenko.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import by.moiseenko.entity.Newspaper;
import by.moiseenko.mapper.NewspaperMapper;

@Repository
public class PeriodicalsDaoImpl implements PeriodicalsDao {

    public JdbcTemplate jdbcTemplate;

    @Autowired
    public PeriodicalsDaoImpl(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Newspaper> getAll() {
	String sql = "SELECT * FROM newspapers";
	return jdbcTemplate.query(sql, new NewspaperMapper());
    }

    @Override
    public void add(Newspaper newspaper) {
	String sql = "INSERT INTO newspapers (ISSN, title, description, qty_per_year, price) VALUE (?, ?, ?, ?, ?)";
	jdbcTemplate.update(sql, newspaper.getIssn(), newspaper.getTitle(), newspaper.getDescription(),
		newspaper.getQtyPerYear(), newspaper.getPrice());

    }

}
