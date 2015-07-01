package com.example.lingxiangwang.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.style.LeadingMarginSpan;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.amap.api.maps.AMap;
import com.example.lingxiangwang.mylibrary.Plus;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.LeakTraceElement;
import com.squareup.leakcanary.internal.LeakCanaryInternals;


public class MainActivity extends ActionBarActivity {
	private AMap mAMap;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

//		LeakCanary.install(null);
//		Toast.makeText(this, Plus.Result(1, 2), Toast.LENGTH_LONG)
		int a = Plus.Result(1, 2);
		Log.v("answer", a + "");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
