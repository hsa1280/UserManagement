package com.fruit.usermanagement.frontend.response;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;

public class ResponseUtils {

	public static <T> ListWrapper<T> getListWrapper( boolean success, List<T> items ) {

		ListWrapper<T> wrapper = new ListWrapper<T>();

		wrapper.setSuccess( success );
		wrapper.setItems( items );

		return wrapper;

	}

	public static <T> ObjectWrapper<T> getObjectWrapper( boolean success, T result ) {

		return getObjectWrapper( success, "", result );

	}

	public static <T> ObjectWrapper<T> getObjectWrapper( boolean success, String message, T result ) {

		List<String> messages = new ArrayList<String>();

		messages.add( message );

		return getObjectWrapper( success, messages, result );

	}

	public static <T> ObjectWrapper<T> getObjectWrapper( boolean success, List<String> messages, T result ) {

		ObjectWrapper<T> wrapper = new ObjectWrapper<T>();

		wrapper.setSuccess( success );
		wrapper.setMessages( messages );
		wrapper.setResult( result );

		return wrapper;

	}
	
	public static List<String> convertErrorsToList( Errors errors ) {
		
		List<String> messages = new ArrayList<String>();
		
		if( errors != null ) {
			
			for( ObjectError error : errors.getAllErrors() ) {
				messages.add( error.getDefaultMessage() );
			}
			
		}
		
		return messages;
		
	}

}
