package th.co.tac.kms.web.service;

import java.text.MessageFormat;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * <p> SODA Project </p>
 * @version 1.0
 * @author Phongsathorn Anguyarn <phongsathorn@xp-link.com>
 * @since September, 2016
 *
 */

public class AbstractService {

	private Logger logger = LogManager.getLogger(this.getClass());
	private static final String LOG_SRVC_NAME = "[SRVC] - ";
	
	
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
