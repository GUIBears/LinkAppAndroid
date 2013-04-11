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
		sexton = (Button) findViewById(R.id.sextonButton);
		flynntown = (Button) findViewById(R.id.flynntownButton);
		gorecki = (Button) findViewById(R.id.goreckiButton);
		east = (Button) findViewById(R.id.eastButton);
		
		
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void onClick(View view) {
		Intent i = new Intent(this, SecondActivity.class);
		
		Button b = (Button) view;
		String s = b.getText().toString();
		if(b == flynntown) {
			i.putExtra("title", s);
		}
		else if(b == sexton){
			i.putExtra("title", s);
		}
		else if(b == gorecki){
			i.putExtra("title", s);
		}
		else if(b == east){
			i.putExtra("title", s);
		}
		startActivity(i);
		
	}
}
