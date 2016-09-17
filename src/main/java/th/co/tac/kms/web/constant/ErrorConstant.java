package th.co.tac.kms.web.constant;

/**
 * <p> SODA Project </p>
 * @version 1.0
 * @author Phongsathorn Anguyarn <phongsathorn@xp-link.com>
 * @since September, 2016
 *
 */

public class ErrorConstant {

	private ErrorConstant() {}
	
	public static final String ERR_CODE_UNEXPECTED = "00000";
	public static final String ERR_DESC_UNEXPECTED = "Unexpected error";
	public static final String ERR_CODE_GET_DB_CONN = "00001";
	public static final String ERR_DESC_GET_DB_CONN = "Cannot get database connection";
	public static final String ERR_CODE_CLOSE_DB_CONN = "00002";
	public static final String ERR_DESC_CLOSE_DB_CONN = "Cannot close database connection";
	public static final String ERR_CODE_EXEC_SQL = "00003";
	public static final String ERR_DESC_EXEC_SQL = "Cannot close database connection";
	
}
