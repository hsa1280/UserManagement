package com.fruit.usermanagement.frontend.response;

import java.util.List;

public class ObjectWrapper<T> {

	private boolean success;

	private List<String> messages;

	private T result;

	public ObjectWrapper() {
		super();
	}

	public ObjectWrapper( boolean success, T result ) {
		super();
		this.success = success;
		this.result = result;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess( boolean success ) {
		this.success = success;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages( List<String> messages ) {
		this.messages = messages;
	}

	public T getResult() {
		return result;
	}

	public void setResult( T result ) {
		this.result = result;
	}

}
