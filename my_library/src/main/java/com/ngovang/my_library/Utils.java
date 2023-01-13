package com.ngovang.my_library;

import android.content.Context;
import android.widget.Toast;

public class Utils {
	final Context context;

	public Utils(Context context) {
		this.context = context;
	}

	public void showToast(String message) {
		Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
	}
}
