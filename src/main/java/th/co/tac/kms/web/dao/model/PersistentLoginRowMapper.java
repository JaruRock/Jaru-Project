package th.co.tac.kms.web.dao.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * <p> SODA Project </p>
 * @version 1.0
 * @author Phongsathorn Anguyarn <phongsathorn@xp-link.com>
 * @since September, 2016
 *
 */

public class PersistentLoginRowMapper implements RowMapper<PersistentLogin> {

	@Override
	public PersistentLogin mapRow(ResultSet rs, int rowNum) throws SQLException {
		PersistentLogin model = new PersistentLogin();
		model.setUsername(rs.getString(""));
		model.setSeries(rs.getString(""));
		model.setToken(rs.getString(""));
		model.setLastUsed(rs.getDate(""));
		return model;
	}

}
