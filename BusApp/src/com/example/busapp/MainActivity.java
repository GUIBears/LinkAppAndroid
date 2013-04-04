package com.example.busapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	Button sexton, flynntown, gorecki, east;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		sexton = (Button) findViewById(R.id.);
		flynntown = (Button) findViewById(R.id.button2);
		gorecki = (Button) findViewById(R.id.button3);
		east = (Button) findViewById(R.id.button4);
		
		
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void onClick(View view) {
		Intent i = new Intent();
		Button b = (Button)view;
		String s = b.getText().toString();
		if(view == sexton){
			i.putExtra("sexton", s);
		}
		else if(view == flynntown) {
			i.putExtra("flynntown", s);
		}
		else if(view == gorecki){
			i.putExtra("gorecki", s);
		}
		else if(view == east){
			i.putExtra("east", s);
		}
	}
}
