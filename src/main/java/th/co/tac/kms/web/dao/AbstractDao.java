package th.co.tac.kms.web.dao;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.Scanner;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import th.co.tac.kms.web.config.sql.SQLPropertyFileConfig;

/**
 * <p> SODA Project </p>
 * @version 1.0
 * @author Phongsathorn Angyarn <phongsathorn@xp-link.com>
 * @since September, 2016
 *
 */

@Repository
public abstract class AbstractDao extends JdbcDaoSupport implements Serializable {

	private static final long serialVersionUID = 5150364520692513184L;

	private static final String LOG_SRVC_NAME = "[DAO] - ";
	private Logger logger = LogManager.getLogger(this.getClass());

	
	protected JdbcTemplate jdbcTemplate;	
	protected NamedParameterJdbcTemplate parameterJdbcTemplate;
	
	@Lazy
	@Autowired()
	protected DataSource dataSource;
	
	@Autowired
	protected SQLPropertyFileConfig sqlConfig;
	
	@PostConstruct
	private void initialize() {
		setDataSource(this.dataSource);
		jdbcTemplate = new JdbcTemplate(dataSource);
		parameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	
	protected void log_info(String wording, Object... arguments) {
		String mesg = MessageFormat.format(wording, arguments);
		log_info(mesg);
	}

	protected void log_debug(String wording, Object... arguments) {
		String mesg = MessageFormat.format(wording, arguments);
		log_debug(mesg);
	}
	
	protected void log_info(String msg) {
		this.logger.info(LOG_SRVC_NAME + msg);
	}
	
	protected void log_debug(String msg) {
		this.logger.debug(LOG_SRVC_NAME + msg);
	}
	
	protected void log_error(String msg) {
		this.logger.error(LOG_SRVC_NAME + msg);
	}
	
	protected void log_error(String msg, Throwable e) {
		this.logger.error(LOG_SRVC_NAME + msg);
		logTrowable(e);
	}

	private void logTrowable(Throwable cause) {
		String prefix = "Cause by " + cause.getClass().getName() + ": ";
		String message = cause.getMessage();
		if (message != null) {
			Scanner sc = new Scanner(message);
			while (sc.hasNext()) {
				log_error(prefix + sc.nextLine());
				prefix = "  ";
			}
			sc.close();
		} else {
			log_error(prefix);
		}
		StackTraceElement[] traces = cause.getStackTrace();
		for (StackTraceElement trace : traces) {
			log_error(toStackTraceString(trace));
		}
		if (cause.getCause() != null) {
			logTrowable(cause.getCause());
		}
	}

	private String toStackTraceString(StackTraceElement trace) {
		return "  at " + trace.getClassName() + "." + trace.getMethodName() + " (" + trace.getFileName() + ":" + trace.getLineNumber() + ")";
	}
	
}
