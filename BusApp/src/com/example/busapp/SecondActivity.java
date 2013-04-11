package com.example.busapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends Activity {
	
	TextView title;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		Intent intent = getIntent();
		String buttonTitle = getIntent().getExtras().getString("title");
		title = (TextView) findViewById(R.id.textView1);
		title.setText(buttonTitle);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_second, menu);
		return true;
	}

}
