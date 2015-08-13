package com.fruit.usermanagement.frontend.response;

import java.util.List;

public class ListWrapper<T> {

	private boolean success;

	private List<T> items;

	public ListWrapper() {
		super();
	}

	public ListWrapper( boolean success,  List<T> items ) {

		super();
		this.success = success;
		this.items = items;

	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess( boolean success ) {
		this.success = success;
	}

	public List<T> getItems() {
		return items;
	}

	public void setItems( List<T> items ) {
		this.items = items;
	}

}
