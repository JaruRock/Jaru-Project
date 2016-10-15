package th.co.tac.kms.web.dao.model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p> SODA Project </p>
 * @version 1.0
 * @author Phongsathorn Angyarn <phongsathorn@xp-link.com>
 * @since September, 2016
 *
 */

public class PersistentLogin implements Serializable {

	private static final long serialVersionUID = 4584068364688718699L;

	private String series;
	private String username;
	private String token;
	private Date lastUsed;

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getLastUsed() {
		return lastUsed;
	}

	public void setLastUsed(Date lastUsed) {
		this.lastUsed = lastUsed;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersistentLogin [series=");
		builder.append(series);
		builder.append(", username=");
		builder.append(username);
		builder.append(", token=");
		builder.append(token);
		builder.append(", lastUsed=");
		builder.append(lastUsed);
		builder.append("]");
		return builder.toString();
	}

}
