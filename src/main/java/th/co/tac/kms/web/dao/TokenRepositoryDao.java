package th.co.tac.kms.web.dao;

import java.sql.Types;
import java.util.Date;

import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import th.co.tac.kms.web.config.sql.SQLPropertyFileConfig;
import th.co.tac.kms.web.constant.SQLConstant;
import th.co.tac.kms.web.dao.model.PersistentLogin;
import th.co.tac.kms.web.dao.model.PersistentLoginRowMapper;

/**
 * <p> SODA Project </p>
 * @version 1.0
 * @author Phongsathorn Anguyarn <phongsathorn@xp-link.com>
 * @since September, 2016
 *
 */

@Repository("tokenRepositoryDao")
@Transactional
public class TokenRepositoryDao extends AbstractDao implements PersistentTokenRepository {

	private static final long serialVersionUID = 881368237040644359L;
	
	@Override
	public void createNewToken(PersistentRememberMeToken token) {
		log_info("Creating Token for user " + token.getUsername());
		String sql = this.sqlConfig.getSql(SQLConstant.INSERT_PERSIT_TOKEN_KEY);
		log_info(SQLConstant.INSERT_PERSIT_TOKEN_KEY + "=" + SQLPropertyFileConfig.removeNewLineAndTab(sql));
		
		Object[] parms = {
			token.getUsername(),
			token.getSeries(),
			token.getTokenValue(),
			token.getDate()
		};
		
		int[] types = {
			Types.VARCHAR,
			Types.VARCHAR,
			Types.VARCHAR,
			Types.DATE
		};
		
		int rowUpdate = getJdbcTemplate().update(sql, parms, types);
		log_info("Inserted " + rowUpdate + " row(s)");
	}

	@Override
	public PersistentRememberMeToken getTokenForSeries(String seriesId) {
		log_info("Fetch Token if any for seriesId " + seriesId);
		try {
			String sql = this.sqlConfig.getSql(SQLConstant.SELECT_PERSIT_TOKEN_KEY);
			log_info(SQLConstant.SELECT_PERSIT_TOKEN_KEY + "=" + SQLPropertyFileConfig.removeNewLineAndTab(sql));

			Object[] parms = { seriesId };
			int[] types = { Types.VARCHAR };
			
			PersistentLogin persistentLogin = getJdbcTemplate().queryForObject(sql, parms, types, new PersistentLoginRowMapper());
			log_debug(persistentLogin.toString());
			return new PersistentRememberMeToken(persistentLogin.getUsername(), persistentLogin.getSeries(), persistentLogin.getToken(), persistentLogin.getLastUsed());
		} catch (Exception e) {
			log_error("Token not found", e);
			return null;
		}
	}

	@Override
	public void removeUserTokens(String username) {
		log_info("Removing Token if any for user " + username);
		String sql = this.sqlConfig.getSql(SQLConstant.DELETE_PERSIT_TOKEN_KEY);
		log_info(SQLConstant.DELETE_PERSIT_TOKEN_KEY + "=" + SQLPropertyFileConfig.removeNewLineAndTab(sql));

		Object[] parms = { username };
		int[] types = { Types.VARCHAR };
		
		int rowUpdate = getJdbcTemplate().update(sql, parms, types);
		log_info("Deleted " + rowUpdate + " row(s)");
	}

	@Override
    public void updateToken(String seriesId, String tokenValue, Date lastUsed) {
        log_info("Updating Token for seriesId=" + seriesId);
        String sql = this.sqlConfig.getSql(SQLConstant.UPDATE_PERSIT_TOKEN_KEY);
		log_info(SQLConstant.UPDATE_PERSIT_TOKEN_KEY + "=" + SQLPropertyFileConfig.removeNewLineAndTab(sql));

		Object[] parms = { 
			tokenValue,
			lastUsed,
			seriesId 
		};
		
		int[] types = { 
			Types.VARCHAR,
			Types.DATE,
			Types.VARCHAR
		};
		
		int rowUpdate = getJdbcTemplate().update(sql, parms, types);
		log_info("Updated " + rowUpdate + " row(s)");
    }

}