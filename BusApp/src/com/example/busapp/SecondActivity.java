package com.example.busapp;

import android.os.Bundle;
import android.provider.AlarmClock;
import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class SecondActivity extends Activity {
	
	TextView title;
	//String[] times;
	private SQLiteDatabase database;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		Intent intent = getIntent();
		String buttonTitle = getIntent().getExtras().getString("title");
		View mainLayout = findViewById(R.id.layout);

		if(buttonTitle.equals("Sexton")) {
			mainLayout.setBackgroundResource(R.drawable.sextonexterior);

		}
		else if(buttonTitle.equals("Flynntown")){
			mainLayout.setBackgroundResource(R.drawable.flynntown);
			
		}
		else if(buttonTitle.equals("Gorecki")){
			mainLayout.setBackgroundResource(R.drawable.gorecki);
		}
		else if(buttonTitle.equals("East")){
			mainLayout.setBackgroundResource(R.drawable.road);
		}
		
		title = (TextView) findViewById(R.id.textView1);
		title.setText(buttonTitle);
		title.setTextColor(this.getResources().getColor(R.color.white));
		ListView timeList = (ListView) findViewById(R.id.timeList);
		 ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
		 for(int i = 0; i<10;i++) {
			 adapter.add("" + i);
		 }
		 timeList.setAdapter(adapter);
		
		 
		 timeList.setOnItemClickListener(new OnItemClickListener() {
			 public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				 //Toast.makeText(getApplicationContext(), "You clicked " + position , Toast.LENGTH_LONG).show();
				 Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
				 i.putExtra(AlarmClock.EXTRA_HOUR, 0);
				 i.putExtra(AlarmClock.EXTRA_MINUTES, 0);
				 startActivity(i);
			 }
		 });
		 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_second, menu);
		return true;
	}


}
