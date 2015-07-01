package de.goddchen.android.gradle.helloworld;

import de.goddchen.android.gradle.helloworld.R;
import de.goddchen.android.gradle.helloworld.BuildConfig;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(BuildConfig.IS_RELEASE) {
            Toast.makeText(this, "这是release版本!", Toast.LENGTH_SHORT).show();
        }
	    else{
	        Toast.makeText(this, "这是debug版本!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
