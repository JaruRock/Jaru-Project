package th.co.tac.kms.web.exception;

/**
 * <p> SODA Project </p>
 * @version 1.0
 * @author Phongsathorn Angyarn <phongsathorn@xp-link.com>
 * @since July, 2016
 *
 */

public class ServiceException extends Exception {

	private static final long serialVersionUID = -2944845369414013811L;

	private String serviceName;
	private String errorCode;
	
	public ServiceException(Throwable e) {
		super(e);
	}
	
	public ServiceException(String serviceName, String errorCode, String errorMessage) {
		super(errorMessage);
		this.serviceName = serviceName;
		this.errorCode = errorCode;
	}
	
	public ServiceException(String serviceName, String errorCode, String errorMessage, Throwable e) {
		super(errorMessage, e);
		this.serviceName = serviceName;
		this.errorCode = errorCode;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
}
