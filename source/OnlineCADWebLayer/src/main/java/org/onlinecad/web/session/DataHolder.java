package org.onlinecad.web.session;

import java.io.Serializable;

public class DataHolder implements Serializable {

	private static final long serialVersionUID = 744512955242499853L;

	private long pageState;
	private String message;

	// ============ Properties Section ============

	public long getPageState() {
		return pageState;
	}

	public void setPageState(long pageState) {
		this.pageState = pageState;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
