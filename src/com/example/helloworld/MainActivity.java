package com.example.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.util.TypedValue;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.*;

public class MainActivity extends ActionBarActivity {
	
	private Button button1,button2,button3;
	private TextView text;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		Button button1 = (Button) findViewById(R.id.button1);
		Button button2 = (Button) findViewById(R.id.button2);
		Button button3 = (Button) findViewById(R.id.button3);		
		text = (TextView) findViewById(R.id.text_view);
		button1.setOnClickListener(new OnClickListener(){
			@Override	
			public void onClick(View v){
				Toast.makeText(MainActivity.this, "You clicked Button 1",
						Toast.LENGTH_SHORT).show();
				float size;
				size = (int)text.getTextSize();
				size++;
				text.setTextSize(TypedValue.COMPLEX_UNIT_PX, size);
			}	  
		});
		button2.setOnClickListener(new OnClickListener(){
			@Override	
			public void onClick(View v){
				float size;
				size = (int)text.getTextSize();
				size--;
				text.setTextSize(TypedValue.COMPLEX_UNIT_PX, size);
			}	  
		});		
		button3.setOnClickListener(new OnClickListener(){
			@Override	
			public void onClick(View v){
				int color = text.getCurrentTextColor();
				color=color+100;
				text.setTextColor(color);
			}	  
		});		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
