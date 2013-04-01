package com.ankur.filemanager.callbacks;

public interface OperationCallback<T> {

	T onSuccess();
	void onFailure(Throwable e);
}
