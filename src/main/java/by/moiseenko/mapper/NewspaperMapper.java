package by.moiseenko.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import by.moiseenko.entity.Newspaper;

public class NewspaperMapper implements RowMapper<Newspaper> {

    @Override
    public Newspaper mapRow(ResultSet rs, int rowNum) throws SQLException {
	Newspaper newspapper = new Newspaper();
	newspapper.setIssn(rs.getString("ISSN"));
	newspapper.setTitle(rs.getString("title"));
	newspapper.setDiscription(rs.getString("discription"));
	newspapper.setQtyPerYear(rs.getInt("qty_per_year"));
	newspapper.setPrice(rs.getBigDecimal("price"));
	System.out.println(newspapper);
	return newspapper;
    }

}
