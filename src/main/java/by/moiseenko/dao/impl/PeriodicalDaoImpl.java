package by.moiseenko.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import by.moiseenko.dao.PeriodicalDao;
import by.moiseenko.entity.Periodical;
import by.moiseenko.mapper.PeriodicalMapper;

@Repository
public class PeriodicalDaoImpl implements PeriodicalDao {

    private final String SQL_INSERT_INTO_PERIODICALS = "INSERT INTO periodicals (ISSN, title, description, qty_per_year, price) VALUE (?, ?, ?, ?, ?)";
    private final String SQL_SELECT_ALL_FROM_PERIODICALS = "SELECT * FROM periodicals WHERE active = 1";
    private final String SQL_SELECT_BY_ID_FROM_PERIODICALS = "SELECT * FROM periodicals WHERE id=?";
    private final String SQL_UPDATE_BY_ID_FROM_PERIODICAL = "UPDATE periodicals SET ISSN = ?, title = ?, description = ?, qty_per_year = ?, price = ? WHERE id=?";
    private final String SQL_DELETE_BY_ID_FROM_PERIODICALS = "UPDATE periodicals SET active = 0 WHERE id = ?";

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public PeriodicalDaoImpl(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Periodical> getAllPeriodicals() {
	return jdbcTemplate.query(SQL_SELECT_ALL_FROM_PERIODICALS, new PeriodicalMapper());
    }

    @Override
    public void addPeriodical(Periodical periodical) {
	jdbcTemplate.update(SQL_INSERT_INTO_PERIODICALS, periodical.getIssn(), periodical.getTitle(),
		periodical.getDescription(), periodical.getQtyPerYear(), periodical.getPrice());

    }

    @Override
    public void editPeriodicalById(Periodical periodical) {
	System.out.println(periodical);
	jdbcTemplate.update(SQL_UPDATE_BY_ID_FROM_PERIODICAL, periodical.getIssn(), periodical.getTitle(),
		periodical.getDescription(), periodical.getQtyPerYear(), periodical.getPrice(), periodical.getId());

    }

    @Override
    public void deletePeriodicalById(Periodical periodical) {
	jdbcTemplate.update(SQL_DELETE_BY_ID_FROM_PERIODICALS, periodical.getId());

    }

    @Override
    public Periodical getPeriodicalById(int id) {
	return jdbcTemplate.queryForObject(SQL_SELECT_BY_ID_FROM_PERIODICALS, new Object[] { id },
		new PeriodicalMapper());
    }

}
