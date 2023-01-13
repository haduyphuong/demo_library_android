package com.ngovang.demo_library_android;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.ngovang.my_library.Utils;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	@Override
	protected void onResume() {
		super.onResume();
		new Utils(this).showToast("Demo");
	}
}