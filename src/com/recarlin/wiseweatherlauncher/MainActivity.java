package com.recarlin.wiseweatherlauncher;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//Sets up a listener for the button. Takes the zip in the edittext and sends it as an extra on the intent that opens WiseWeather.
		Button getForcast = (Button) findViewById(R.id.forcastButton);
		getForcast.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String zip = ((EditText)findViewById(R.id.zip)).getText().toString();
				Log.i("ZIP", zip);
				String CUSTOM_ACTION = "com.recarlin.wiseweather.FORECAST";
				Intent intent = new Intent(CUSTOM_ACTION, null);
				intent.putExtra("zip", zip);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
