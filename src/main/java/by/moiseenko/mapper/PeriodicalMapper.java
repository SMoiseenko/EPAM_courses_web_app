package by.moiseenko.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import by.moiseenko.entity.periodical.Periodical;

public class PeriodicalMapper implements RowMapper<Periodical> {

    @Override
    public Periodical mapRow(ResultSet rs, int rowNum) throws SQLException {
	Periodical periodical = new Periodical();
	periodical.setId(rs.getInt("id"));
	periodical.setIssn(rs.getString("ISSN"));
	periodical.setTitle(rs.getString("title"));
	periodical.setDescription(rs.getString("description"));
	periodical.setQtyPerYear(rs.getInt("qty_per_year"));
	periodical.setPrice(rs.getBigDecimal("price"));
	periodical.setActive(rs.getBoolean("active"));
	return periodical;
    }

}
